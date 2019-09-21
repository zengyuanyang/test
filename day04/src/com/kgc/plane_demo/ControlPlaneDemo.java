package com.kgc.plane_demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
import java.util.Random;
/**一, 测试移动背景:
 * 	1.背景图片初始y坐标怎么设置  2.两张背景图片怎么轮播
 * 二, 测试鼠标操纵飞机移动: 实现MouseMotionListener接口，为游戏页面添加该监听器(此处我们实现的监听器证实游戏页面自己)。
 * 	1.让飞机坐标直接等同于鼠标坐标会出现飞机瞬移吗?答：其实玩家移动鼠标挺慢的，基本不会产生瞬移bug
 * 	1.5飞机坐标等同鼠标坐标改进:让鼠标出现在飞机中心。
 * 2.让飞机不超出界面:解决方式--绘飞机图前判断飞机坐标是否合适，不合适的强制改成相应的边界值。
 * 
 * 三：让我的飞机发射子弹:每过一段时间飞机发射1发子弹。即每过一段时间我们产生一枚子弹。
 * 子弹和飞机其实一样，通过坐标，图片，速度就能描述。**但是**，考虑到会产生7，8枚子弹，每个敌人又产生3,4枚子弹，我们决定用一个类来描述它。
 * 而坐标，图片，速度这种方式也显然很适合描述敌方飞机。所以我们直接定义了一个Entity类：有x,y坐标，速度，图片这些成员变量。有Draw(Graphics g)方法，
 * 1.定义Entity类描述我的子弹
 * 2.游戏页面类应该有个容器类对象，用于装所有的我飞机了的子弹。
 * 3.每隔一段时间(1帧或n帧后)，new我的子弹(Entity对象)，装入容器。
 * 4.每次重画(每一帧)里，都应该将容器里的所有子弹对象取出来，画出来。
 * 4.1 改进:飞出屏幕的子弹应该从容器中remove().
 * @author HuppertY
 * @date2019年9月12日
 * 四. 项目中ui包下的GameJFrame.java 实现的就是游戏功能。碰撞判定，是根据entity对象坐标以Entity对象的坐标，图片宽高为参数
 * 来创建矩形对象，new Rectangle(x,y,w,h)。Rectangle矩形类有方法boolean intersection​(Rectangle r),判定两个矩形是否相交。
 * 所以例如我的子弹打中敌人让敌人消失应该怎么实现呢？ 答:双重循环，让我的每一颗子弹相应的矩形对象与所有敌人的矩形对象作相交判定，如果相交，则从容器中敌人和子弹。
 */
public class ControlPlaneDemo extends JPanel implements Runnable,MouseMotionListener{
	int myPlaneX= (Config.WINDOW_W-Config.MY_PLANE_W)/2;
	int myPlaneY= Config.WINDOW_H-Config.MY_PLANE_H-50;
	//用链表存储敌人飞机
	LinkedList<Entity> myBulletEntity = new LinkedList<Entity>();
	LinkedList<Entity> enemiesEntity = new LinkedList<Entity>();
	int repaintCount;//记录线程画了多少帧画(或者说记录调用了多少次paintComponent)，用于调整子弹，敌人出现的频率
	//为什么放上下面这句，或者在构造方法里放上这句运行程序就会是一片白板呢呢？暂时未解决。
	//Image MyPlaneImg = new ImageIcon(".\\img\\fly_zhanshi1.png").getImage();
	int bg_y=Config.BG_START_POSITION_Y;
	int bg_y2=Config.BG2_START_POSITION_Y;
	int bg_speed=2;
	//构造
	public ControlPlaneDemo() {
		// TODO Auto-generated constructor stub
		super();
		this.addMouseMotionListener(this);//添加鼠标监听
	}
	//启动线程的方法
	public void startGame() {
		new Thread(this).start();
	}
	//int bg2_y;
	//画一张往下移动的背景图片
	public void drawBgImg(Graphics g) {
		Image img = new ImageIcon(".\\img\\d004_01_a.jpg").getImage();
		Image img2 = new ImageIcon(".\\img\\d004_01_b.jpg").getImage();
		int i = img.getWidth(null);
		//int j = img.getHeight(null)
		//如果图片的顶部都已经到了窗口下方，那么我们就该重置该图片为图片2的起始位置。
		if(bg_y>=Config.WINDOW_H) {
			bg_y=Config.BG2_START_POSITION_Y+50;
		}else if(bg_y2>=Config.WINDOW_H) {
			bg_y2=Config.BG2_START_POSITION_Y+50;
		}
		g.drawImage(img, 0, bg_y, null);
		g.drawImage(img2, 0, bg_y2, null);
		bg_y+=bg_speed;
		bg_y2+=bg_speed;
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		Image myPlaneImg= new ImageIcon(".\\img\\fly_zhanshi1.png").getImage();
		Image myBulletImg = new ImageIcon(".\\img\\mybullet.png").getImage();
		//清屏
		//super.paintComponent(g);
		//画一张往下移动的背景图片
		drawBgImg(g);
		//画我的飞机
		drawMyPlane(g,myPlaneImg);
		//产生子弹:
		if(repaintCount%2==0)
			newMyBullet(myBulletImg);
		//画我的子弹
		drawMyBullet(g);
		//产生点敌人玩一玩： 10帧产生一次敌人。
		if(repaintCount%10==0) {
			newEnemy();
		}
		//画出敌人
		drawEnemies(g);
		//画我的子弹打中敌人
		
		//画完这一帧图，计数+1
		repaintCount++;
	}
	/**
	 * 画飞机
	 * @return void
	 * @param g
	 * @param myPlaneImg 飞机图片
	 */
	private void drawMyPlane(Graphics g,Image myPlaneImg) {
		/**
		 * 保证整个飞机一直在游戏页面内。
		 */
		if(myPlaneX<0) {
			myPlaneX=0;
		}
		else if(myPlaneX>Config.WINDOW_W-Config.MY_PLANE_W) {
			myPlaneX=Config.WINDOW_W-Config.MY_PLANE_W;
		}
		if(myPlaneY<0) {
			myPlaneY=0;
		}
		else if(myPlaneY>Config.WINDOW_H-Config.MY_PLANE_H) {
			myPlaneY=Config.WINDOW_H-Config.MY_PLANE_H;
		}
		g.drawImage(myPlaneImg, myPlaneX, myPlaneY, null);
	}
	//产生我的子弹
	public void newMyBullet(Image img) {
		//new一个子弹放入链表中（Entity是描述运动物体的类，因为我们的参数，它就实例化为我的飞机前方的一枚子弹)
		myBulletEntity.add(new Entity(myPlaneX+40, myPlaneY-40, -15, img));
	}
	//画子弹
	public void drawMyBullet(Graphics g) {
		for(int i=0; i<myBulletEntity.size(); i++) {
			Entity b=myBulletEntity.get(i);
			//如果我的子弹飞到了窗口的最上方，那么，从容器中移除子弹。
			if(b.y<0) {
				myBulletEntity.remove(i);
				//System.out.println("移除");
			}
			b.draw(g);
		}
	}
	//new敌人，放到容器中
	public void newEnemy() {
		Random r = new Random();
		Image[] imgs = Config.getEnemyImgs();
		enemiesEntity.add(new Entity(r.nextInt(Config.WINDOW_W-50), 0,
				r.nextInt(12)+3,
				imgs[r.nextInt(imgs.length)]));
	}
	//画出敌人(可以改进，画敌人画我的子弹都是很相似的行为， 只是容器不一样和移除的判定条件，我们将容器作为参数，
	//再多添加一个判定条件，那么写个画运动物体方法就会很舒服了。)
	public void drawEnemies(Graphics g) {
		for(int i=0; i<enemiesEntity.size(); i++) {
			
			Entity e = enemiesEntity.get(i);
			
			e.draw(g);
			//如果敌人飞机超出屏幕那么就从容器中移除敌人。
			if(e.y>Config.WINDOW_H) {
				enemiesEntity.remove(e);
				//System.out.println("移除");
			}
		}
	}
	//鼠标移动后 飞机坐标改变
	private void mousePerform(MouseEvent e) {
		Point p = e.getPoint();//通过鼠标事件的方法获取坐标
		myPlaneX = (int)p.getX()-Config.MY_PLANE_W/2;//获取x坐标，返回的是double类型，需要强转
		myPlaneY = (int)p.getY()-Config.MY_PLANE_H/2;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println(Thread.currentThread().getId());
		mousePerform(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		mousePerform(e);
	}
	
	@Override
	/**
	 * 实现Runnable:每过50ms调用1次重画
	 */
	public void run() {
		// TODO Auto-generated method stub
		//System.out.println("线程"+Thread.currentThread().getId());
		while(true) {
			this.repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
/**
 *描述 运动物体的类
 * @author HuppertY
 * @date2019年9月12日
 */
class Entity {
	int x;
	int y;
	int speed;
	Image img;
	public Entity(int x, int y, int speed, Image img) {
		this.x = x;
		this.y = y;
		this.speed =speed;
		this.img = img;
	}
	public void draw(Graphics g) {
		g.drawImage(img, x, y,null);
		y+=speed;//
	}
}