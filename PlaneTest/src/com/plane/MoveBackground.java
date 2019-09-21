package com.plane;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 * 绘制移动背景
 * @author 曾远洋
 * @time 2019年9月12日上午10:28:05
 * @version V1.0
 */
public class MoveBackground extends JPanel implements Runnable,MouseMotionListener {
	//int speed=0;
	int y1 = -750;		//背景1的y位置
	int y2 = -2500;		//背景2的y位置
	//敌机位置
	int enemy_x = (int)(Math.random()*600 + 1);		
	int enemy_y = 0;
	//战机初始位置
	int myPlane_x = 262;
	int myPlane_y = 700;
	int count = 0;		//纪录重绘次数
	LinkedList<Bullet> myBullet = new LinkedList<Bullet>();	//链表，用于存放战机子弹
	//构造方法
	public MoveBackground() {
		//this.addMouseMotionListener(this);	//添加监听器
	}

	@Override
	public void run() {
		//循环重绘
		while(true) {
			repaint();		
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);		//清屏
		Image b1 = new ImageIcon(".\\images\\d004_01_a.jpg").getImage();
		Image b2 = new ImageIcon(".\\images\\d004_01_b.jpg").getImage();
		Image plane = new ImageIcon(".\\images\\fly_zhanshi1.png").getImage();
		Image bullet = new ImageIcon(".\\images\\mybullet.png").getImage();
		Image enemy = new ImageIcon(".\\images\\enemy20.png").getImage();
		//判断背景，使背景循环
		if(y1 >= 1000) {
			y1 = -2500;
		}else if(y2 >= 1000) {
			y2 = -2500;
		}
		//绘制背景
		g.drawImage(b1, 0, y1, this);
		g.drawImage(b2, 0, y2, this);
		g.drawImage(plane, myPlane_x, myPlane_y, this);		//绘制战机
		drawBullet(g);	
	    newBullet(bullet);		//创建子弹
										//绘制子弹
		
		
		g.drawImage(enemy, enemy_x, enemy_y, this);			//绘制敌机
		//碰撞检测
		if((int)(Math.pow(enemy_y-myPlane_y, 2) + (int)(Math.pow(enemy_x-myPlane_x, 2))) <= 5000) {
			System.out.println("相撞");
		}
		//判断敌机位置，使敌机循环出现
		if(enemy_y >= 1000) {
			enemy_y = 0;
			enemy_x = (int)(Math.random()*600 + 1);
		}
		y1 += 1;
		y2 += 1;
		enemy_y += 2;
		//y4 -= 2;
		count++;
	}
	//创建子弹
	private void newBullet(Image bullet) {
		//speed+=10;
		myBullet.add(new Bullet(myPlane_x, myPlane_y, 50, bullet));//100
	}
	//绘制子弹
	private void drawBullet(Graphics g) {
		for(int i = 0; i < myBullet.size();i++) {
			Bullet b = myBullet.get(i);
			if(b.y < 0) {
				myBullet.remove(i);		//移除出界子弹
			}
			b.draw(g);		//调用绘制方法
		}
	}

	@Override
	//鼠标拽动监听
	public void mouseDragged(MouseEvent e) {
		myPlane_x = e.getX()-56;
		myPlane_y = e.getY()-66;
		if(myPlane_x < 0) {
			myPlane_x = 0;
		}else if(myPlane_x > 530) {
			myPlane_x = 530;
		}
		if(myPlane_y < 0) {
			myPlane_y = 0;
		}else if(myPlane_y > 870) {
			myPlane_y = 870;
		}
	}

	@Override
	//鼠标移动监听
	public void mouseMoved(MouseEvent e) {
		Point p = e.getPoint();
		myPlane_x = (int)p.getX()-56;
		myPlane_y = (int)p.getY()-66;
		if(myPlane_x < 0) {
			myPlane_x = 0;
		}else if(myPlane_x > 530) {
			myPlane_x = 530;
		}
		if(myPlane_y < 0) {
			myPlane_y = 0;
		}else if(myPlane_y > 870) {
			myPlane_y = 870;
		}
	}

}
