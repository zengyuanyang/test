package com.my.plane;

import java.awt.Graphics;
import java.awt.Image;
/**
 * 子弹实体类
 * @author 曾远洋
 * @time 2019年9月16日上午10:40:03
 * @version V1.0
 */
public class Bullet {
	//子弹坐标
	int bullet_x;
	int bullet_y;
	//子弹y方向速度
	int bulletSpeed_y;
	//子弹x方向速度
	int bulletSpeed_x = (int) (Math.random()*10 - Math.random()*10);
	Image bullet;
	
	public Bullet() {}
	
	public Bullet(int bullet_x,int bullet_y,int bulletSpeed,Image bullet) {
		this.bullet_x = bullet_x;
		this.bullet_y = bullet_y;
		this.bulletSpeed_y = bulletSpeed;
		this.bullet = bullet;
	}
	
	public void drawBullet(Graphics g) {
		g.drawImage(bullet, bullet_x, bullet_y, null);
		bullet_y += bulletSpeed_y;
	}
	
	public void drawBossBullet(Graphics g) {
		g.drawImage(bullet, bullet_x, bullet_y, null);
		
		if(bullet_x <= 0 || bullet_x >=580) {
			bulletSpeed_x = -bulletSpeed_x;
		}
		bullet_y += bulletSpeed_y;
		bullet_x += bulletSpeed_x;
	}
}