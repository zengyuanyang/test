package com.plane;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * 子弹类
 * @author 曾远洋
 * @time 2019年9月12日下午2:58:14
 * @version V1.0
 */
public class Bullet {
	static int x;
	static int y;
	int speed;
	Image image;
	public Bullet(int x,int y,int speed,Image image) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y= y;
		this.speed = speed;
		this.image = image;
		
	}
	
	public void draw(Graphics g) {
		g.drawImage(image, x, y, null);
		y -= speed;
	}
	

}
