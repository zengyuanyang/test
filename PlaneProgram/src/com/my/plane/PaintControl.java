package com.my.plane;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;
/**
 * 游戏主界面的相关控制
 * @author 曾远洋
 * @time 2019年9月16日上午10:40:56
 * @version V1.0
 */
public class PaintControl extends JPanel implements Runnable,MouseMotionListener,KeyListener{
	int bp1 = Sourse.BACKPOSITION_1;	//背景1的y坐标
	int bp2 = Sourse.BACKPOSITION_2;	//背景2的y坐标
	int myplane_x = Sourse.MYPLANE_X;	//战机初始x坐标
	int myplane_y = Sourse.MYPLANE_Y;	//战机初始y坐标
	int bg_speed = 2;					//背景移动速度
	int bulletSpeed = -10;				//子弹速度
	int paintCount = 0;					//计算重绘次数
	int bulletDensity = 5;				//子弹密度
	int enemyDensity = 30;				//敌机密度
	int enemyBulletSpeed = 4;			//敌机子弹速度
	int enemyBulletDensity = 50;		//敌机子弹密度
	int bossBulletDensity = 10;			//Boss子弹的密度
	int plane_w;						//战机宽度
	int plane_h;						//战机高度
	int myBlood = 5;					//战机血量
	int score = 0;						//得分
	int gameover = 0;					//游戏状态，0：战机血量非0；1：胜利；-1：战机血量为0
	boolean pause = false;				//暂停状态
	//实体类链表
	LinkedList<Bullet> bulletList = new LinkedList<Bullet>();		//战机子弹
	LinkedList<Bullet> enemyBulletList = new LinkedList<Bullet>();	//敌机子弹
	LinkedList<Bullet> bossBulletList = new LinkedList<Bullet>();	//Boss子弹
	LinkedList<Enemy> enemyList = new LinkedList<Enemy>();			//敌机
	LinkedList<Boom> boomList = new LinkedList<Boom>();				//爆炸效果
	LinkedList<BloodAndExperience> myBloodList = new LinkedList<BloodAndExperience>();	//血条
	LinkedList<BloodAndExperience> myExperience = new LinkedList<BloodAndExperience>();	//经验条
	LinkedList<Boss> bossList = new LinkedList<Boss>();									//boss
	//新建按钮
	JButton button = new JButton("返 回 主 菜 单");
	
	
	
	/**
	 * 构造方法
	 */
	public PaintControl() {
		this.addMouseMotionListener(this);		//添加鼠标监听
		this.addKeyListener(this);				//添加键盘监听
		//设置按钮样式
		button.setFont(new Font("宋体", Font.BOLD, 20));		
		button.setBounds(134, 709, 300, 50);
		setFocusable(true);			//关键！！！！添加监听必须将空间的焦点获取设为true，否则无法监听！！！
		//初始化血条
		for(int i = 0 ;i < myBlood ;i++) { 
			 myBloodList.add(new BloodAndExperience(350+i*50, 720, 25, 25)); 
		}
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);	//清屏
		drawBackground(g);			//绘制背景
		drawPlane(g);				//绘制飞机
		drawBlood(g,Color.RED,myBloodList);		//绘制血条
		if(paintCount % bulletDensity == 0) {
			newBullet(bulletSpeed);				//创建战机子弹
		}
		drawBullet(g);							//绘制战机子弹
		if(paintCount % enemyDensity == 0) {
			newEnemy();							//创建战机
			
		}
		drawEnemy(g);							//绘制战机
		drawBlood(g,Color.BLUE,myExperience);	//绘制经验值
		if(paintCount % enemyBulletDensity == 0) {
			newEnemyBullet(enemyBulletSpeed);	//创建敌机子弹
		}
		drawEnemyBullet(g);						//绘制敌机子弹
		crash(bulletList,enemyList);			//战机子弹和敌机的碰撞检测
		crashMyPlane(enemyBulletList, enemyList);	//敌机子弹、敌机和战机间的碰撞检测
		drawBoow(g);								//绘制爆炸效果
		
		//当得分大于20时，出现boss
		if(score >= 20) {
			newBoss();					//创建
			Boss boss = drawBoss(g);	//绘制
			//碰撞检测
			crash(bulletList,boss.bossEnemyList);
			crashMyPlane(boss.bossEnemyBulletList, boss.bossEnemyList);
			crashBossMyPlane(bossBulletList, bossList);
			//当boss的僚机消灭完时，boss开始发射子弹，同时Boss才能被战机攻击
			if(boss.bossEnemyList.isEmpty()) {
				crashBoss(bulletList,bossList);
				if(paintCount % bossBulletDensity == 0) {
					newBossBullet();
				}
				
				drawBossBullet(g);
				//当Boss的血量为50时，Boss的子弹密度增加
				if(boss.bossBlood == 50) {
					bossBulletDensity = 5;		
				}
			}
		}
		//判断游戏是否胜利
		if(gameover == -1) {
			drawGameOver(g);						//绘制游戏结束时界面
			add(button);
		}else if(gameover == 1) {
			drawWin(g);
			add(button);
		}
		//重绘次数
		paintCount++;
	}
	
	/**
	 * 绘制背景
	 * @param g
	 */
	public void drawBackground(Graphics g) {
		Image backGround1 = new ImageIcon(".\\images\\d004_01_a.jpg").getImage();	
		Image backGround2 = new ImageIcon(".\\images\\d004_01_a.jpg").getImage();
		g.drawImage(backGround1, 0, bp1, this);
		g.drawImage(backGround2, 0, bp2, this);
		//移动
		bp1 += bg_speed;
		bp2 += bg_speed;
		//判断背景图位置，使背景循环
		if(bp1 >= 800) {
			bp1 = Sourse.BACKPOSITION_2 - bg_speed;
		}else if(bp2 >= 800) {
			bp2 = Sourse.BACKPOSITION_2 - bg_speed;
		}
	}
	
	
	/**
	 * 绘制飞机
	 * @param g
	 */
	public void drawPlane(Graphics g) {
		Image myPlane = new ImageIcon(".\\images\\fly_zhanshi1.png").getImage();
		plane_w = myPlane.getWidth(null);
		plane_h = myPlane.getHeight(null);
		//限制飞机移动位子
		if(myplane_x < 0) {
			myplane_x = 0;
		}else if(myplane_x > 500) {
			myplane_x = 500;
		}
		if(myplane_y < 0) {
			myplane_y = 0;
		}else if(myplane_y > 650) {
			myplane_y = 650;
		}
		g.drawImage(myPlane, myplane_x, myplane_y, this);
	}
	
	/**
	 * 创建子弹
	 * @param bulletSpeed	子弹速度
	 */
	public void newBullet(int bulletSpeed) {
		Image bullet = new ImageIcon(".\\images\\mybullet.png").getImage();
		bulletList.add(new Bullet(myplane_x + plane_w/2 - bullet.getWidth(null)/2,myplane_y - bullet.getHeight(null),bulletSpeed,bullet));
	}
	
	/**
	 * 绘制子弹
	 * @param g
	 */
	public void drawBullet(Graphics g) {
		for(int i = 0; i < bulletList.size();i++) {
			Bullet b = bulletList.get(i);
			//子弹飞出屏幕后被销毁
			if(b.bullet_y < 0) {
				bulletList.remove(i);
			}
			b.drawBullet(g);
		}
	}
	
	/**
	 * 创建敌方子弹
	 * @param enemyBulletSpeed	子弹速度
	 */
	public void newEnemyBullet(int enemyBulletSpeed) {
		Image bullet = new ImageIcon(".\\images\\enemyBullet.png").getImage();
		if(score <= 20) {
			for(int i = 0; i < enemyList.size();i++) {
				Enemy e = enemyList.get(i);
				enemyBulletList.add(new Bullet(e.enemy_x + e.enemy.getWidth(null)/2 - bullet.getWidth(null)/2+(int)Math.random()*122,
						e.enemy_y + e.enemy.getHeight(null), enemyBulletSpeed, bullet));
			}
		}
		
	}
	
	/**
	 * 绘制敌方子弹
	 * @param g
	 */
	public void drawEnemyBullet(Graphics g) {
			for(int i = 0; i < enemyBulletList.size();i++) {
				Bullet b = enemyBulletList.get(i);
				//子弹飞出屏幕后被销毁
				if(b.bullet_y > 800 ) {
					enemyBulletList.remove(i);
				}
				b.drawBullet(g);
			}
	}
	
	/**
	 * 创建敌机
	 */
	public void newEnemy() {
		if(score <= 20) {
			enemyList.add(new Enemy());
		}
	}
	
	/**
	 * 绘制敌机
	 * @param g
	 */
	public void drawEnemy(Graphics g) {
			for(int i = 0; i < enemyList.size();i++) {
				Enemy e = enemyList.get(i);
				//敌机飞出屏幕后被销毁
				if(e.enemy_y > 800) {
					enemyList.remove(i);
				}
				e.drawEnemy(g);
			}
	}
	
	/**
	 * 创建Boss
	 */
	public void newBoss() {
		if(score == 20) {
			bossList.add(new Boss());
		}
		
		
	}
	
	
	/**
	 * 绘制Boss
	 * @param g
	 * @return	返回一个Boss对象
	 */
	public Boss drawBoss(Graphics g) {
			Boss boss = bossList.getFirst();
			boss.drawBoss(g);
			return boss;
	}
	
	/**
	 * 创建Boss子弹
	 */
	public void newBossBullet() {
			Image bullet = new ImageIcon(".\\images\\enemyBullet.png").getImage();
			Boss b = bossList.getFirst();
			bossBulletList.add(new Bullet(b.x+ b.bossImage.getWidth(null)/2 - bullet.getWidth(null)/2+(int)(Math.random()*122-Math.random()*122),b.y + b.bossImage.getHeight(null), 4, bullet));
	}
	
	/**
	 * 绘制Boss子弹
	 * @param g
	 */
	public void drawBossBullet(Graphics g) {
		for(int i = 0;i < bossBulletList.size();i++) {
			bossBulletList.get(i).drawBossBullet(g);
		}
	}
	/**
	 * 碰撞检测(我方子弹和敌方飞机)
	 * @param list1	Bullet类型的链表
	 * @param list2	Enemy类型的链表
	 */
	public void crash(LinkedList<Bullet> list1,LinkedList<Enemy> list2) {
		try {
			for(int i = 0;i < list1.size();i++) {
				for(int j = 0;j < list2.size();j++) {
					if((int)(Math.pow(list1.get(i).bullet_x+list1.get(i).bullet.getWidth(null)/2-list2.get(j).enemy_x-list2.get(j).enemy.getWidth(null)/2, 2) 
							+ (int)(Math.pow(list1.get(i).bullet_y + list1.get(i).bullet.getHeight(null)/2-list2.get(j).enemy_y-list2.get(j).enemy.getHeight(null)/2, 2))) 
							<= (int)(Math.pow(list1.get(i).bullet.getWidth(null)/2 + list2.get(j).enemy.getWidth(null)/2,2))) {
						boomList.add(new Boom(list1.get(i).bullet_x + list1.get(i).bullet.getWidth(null)/2,list1.get(i).bullet_y,new ImageIcon(".\\images\\Boom1.png").getImage()));
						list1.remove(i);
						list2.get(i).blood--;
						if(list2.get(i).blood <= 0) {
							list2.remove(j);
							myExperience.add(new BloodAndExperience(0+score*40, 0, 40, 10));
							score++;
						}
						
						
					}
				}
			}
		}catch(Exception e) {
			
		}
	}
	
	/**
	 * 碰撞检测(我方子弹和Boss)
	 * @param list1	我方子弹
	 * @param list2	Boss实体
	 */
	public void crashBoss(LinkedList<Bullet> list1,LinkedList<Boss> list2) {
		try {
			for(int i = 0;i < list1.size();i++) {
				for(int j = 0;j < list2.size();j++) {
					if((int)(Math.pow(list1.get(i).bullet_x+list1.get(i).bullet.getWidth(null)/2-list2.get(j).x-list2.get(j).bossImage.getWidth(null)/2, 2) 
							+ (int)(Math.pow(list1.get(i).bullet_y+list1.get(i).bullet.getHeight(null)/2-list2.get(j).y-list2.get(j).bossImage.getHeight(null)/2, 2))) 
							<= (int)(Math.pow(list1.get(i).bullet.getWidth(null)/2 + list2.get(j).bossImage.getWidth(null)/2,2))) {
						//添加爆炸效果
						boomList.add(new Boom(list1.get(i).bullet_x + list1.get(i).bullet.getWidth(null)/2,list1.get(i).bullet_y-list1.get(i).bullet.getHeight(null),new ImageIcon(".\\images\\Boom1.png").getImage()));
						list1.remove(i);		//命中后销毁子弹
						list2.get(i).bossBlood--;	//Boss血量减1
						if(list2.get(i).bossBlood <= 0) {
							list2.remove(j);
							gameover = 1;
							score+=10;
						}
						
						
					}
				}
			}
		}catch(Exception e) {
			
		}
	}
	/**
	 * 碰撞检测（我方飞机与敌方飞机子弹）
	 * @param enemyBullet	敌方子弹
	 * @param enemy			敌方飞机
	 */
	public void crashMyPlane(LinkedList<Bullet> enemyBullet,LinkedList<Enemy> enemy) {
		//检测敌方子弹
		for(int i = 0;i < enemyBullet.size();i++) {
			if(Math.pow(enemyBullet.get(i).bullet_x + enemyBullet.get(i).bullet.getWidth(null)/2 - myplane_x - plane_w/2, 2) 
			+ Math.pow(enemyBullet.get(i).bullet_y + enemyBullet.get(i).bullet.getHeight(null)/2 - myplane_y - plane_h/2, 2) 
			<= Math.pow(enemyBullet.get(i).bullet.getWidth(null)/2 + Sourse.MYPLANE_W/2, 2)/2) {
				boomList.add(new Boom(myplane_x,myplane_y,new ImageIcon(".\\images\\Boom1.png").getImage()));
				enemyBullet.remove(i);		//命中后销毁该子弹
				myBlood--;					//血量减1
				myBloodList.removeLast();	//移出血量格
			}
		}
		//检测敌方飞机
		for(int i = 0;i < enemy.size();i++) {
			if(Math.pow(enemy.get(i).enemy_x + enemy.get(i).enemy.getWidth(null)/2 - myplane_x - plane_w/2, 2) 
			+ Math.pow(enemy.get(i).enemy_y + enemy.get(i).enemy.getHeight(null)/2 - myplane_y - plane_h/2, 2) 
			<= Math.pow(enemy.get(i).enemy.getWidth(null)/2 + Sourse.MYPLANE_W/2, 2)/2) {
				boomList.add(new Boom(myplane_x,myplane_y,new ImageIcon(".\\images\\Boom1.png").getImage()));
				enemy.get(i).blood--;
				myBlood--;
				if(enemy.get(i).blood <= 0) {
					
					enemy.remove(i);
				}
				score++;
				myBloodList.removeLast();
			}
		}
		if(myBlood == 0) {
			gameover = -1;
		}
	}
	
	
	/**
	 * 碰撞检测，我方飞机和Boss
	 * @param bossBullet
	 * @param boss
	 */
	public void crashBossMyPlane(LinkedList<Bullet> bossBullet,LinkedList<Boss> boss) {
		for(int i = 0;i < bossBullet.size();i++) {
			if(Math.pow(bossBullet.get(i).bullet_x + bossBullet.get(i).bullet.getWidth(null)/2 - myplane_x - plane_w/2, 2) 
			+ Math.pow(bossBullet.get(i).bullet_y + bossBullet.get(i).bullet.getHeight(null)/2 - myplane_y - plane_h/2, 2) 
			<= Math.pow(bossBullet.get(i).bullet.getWidth(null)/2 + Sourse.MYPLANE_W/2, 2)/2) {
				boomList.add(new Boom(myplane_x,myplane_y,new ImageIcon(".\\images\\Boom1.png").getImage()));
				bossBullet.remove(i);
				myBlood--;
				myBloodList.removeLast();
			}
		}
		for(int i = 0;i < boss.size();i++) {
			if(Math.pow(boss.get(i).x + boss.get(i).bossImage.getWidth(null)/2 - myplane_x - plane_w/2, 2) 
			+ Math.pow(boss.get(i).y + boss.get(i).bossImage.getHeight(null)/2 - myplane_y - plane_h/2, 2) 
			<= Math.pow(boss.get(i).bossImage.getWidth(null)/2 + Sourse.MYPLANE_W/2, 2)/2) {
				boomList.add(new Boom(myplane_x,myplane_y,new ImageIcon(".\\images\\Boom1.png").getImage()));
				boss.get(i).bossBlood--;
				myBlood--;
				if(boss.get(i).bossBlood <= 0) {
					boss.remove(i);
				}
				score++;
				myBloodList.removeLast();
			}
		}
		if(myBlood == 0) {
			gameover = -1;
		}
	}
	
	/**
	 * 绘制血条或经验条
	 * @param g
	 * @param c		颜色
	 * @param list	BloodAndExperience类型的链表
	 */
	public void drawBlood(Graphics g,Color c,LinkedList<BloodAndExperience> list) {
		for(int i = 0;i < list.size();i++) {
			list.get(i).draw(g,c);
		}
	}
	
	/**
	 * 绘制游戏结束界面
	 * @param g
	 */
	public void drawGameOver(Graphics g) {
		Font font = new Font("黑体", Font.BOLD, 50);
		g.setColor(Color.white);
		g.setFont(font);
		g.drawString("GAME OVER", 180, 340);
		g.drawString("你个辣鸡", 200, 460);
		g.drawString("得分：" + score, 200, 540);
	}
	
	/**
	 * 绘制游戏胜利界面
	 * @param g
	 */
	public void drawWin(Graphics g) {
		Font font = new Font("黑体", Font.BOLD, 50);
		g.setColor(Color.white);
		g.setFont(font);
		g.drawString("恭喜过关！", 220, 340);
		g.drawString("你真是太棒了！", 160, 460);
		g.drawString("得分：" + score, 200, 540);
	}
	
	/**
	 * 绘制爆炸效果
	 * @param g
	 */
	public void drawBoow(Graphics g) {
		for(int i = 0;i < boomList.size();i++) {
			if(boomList.get(i).drawCount == 10) {
				boomList.remove(i);
			}else {
				
				boomList.get(i).drawBoom(g);
			}
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		//获取鼠标坐标
		Point p = e.getPoint();
		myplane_x = (int)p.getX() - Sourse.MYPLANE_W/2;
		myplane_y = (int)p.getY() - Sourse.MYPLANE_H/2;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Point p = e.getPoint();
		myplane_x = (int)p.getX() - Sourse.MYPLANE_W/2;
		myplane_y = (int)p.getY() - Sourse.MYPLANE_H/2;
		if((int)p.getX() < 0) {
			pause = true;
		}
	}
	
	
	@Override
	public void run() {
		//使背景动起来
		while(gameover != -1 && gameover != 1) {
			//暂停
			while(pause) {
				try {
					Thread.sleep(Sourse.BACK_SLEEP_2);	
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			repaint();
			try {
				Thread.sleep(Sourse.BACK_SLEEP_2);	
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyChar() == 'p') {
			if(pause == false) {
				pause = true;
			}else {
				pause = false;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
}