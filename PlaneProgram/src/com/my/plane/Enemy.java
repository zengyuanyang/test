package com.my.plane;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 * 敌机实体类
 * @author 曾远洋
 * @time 2019年9月18日上午9:45:49
 * @version V1.0
 */
public class Enemy {
	//敌机坐标
	int enemy_x = (int) (Math.random()*500);
	int enemy_y = -100;
	//敌机血量
	int blood = 2;
	//敌机速度
	int enemySpeed = 2;
	int i = (int) (Math.random()*Sourse.enemy.length);
	Image enemy = new ImageIcon(Sourse.enemy[i]).getImage();
	//无参构造方法
	public Enemy() {}
	//有参构造方法
	public Enemy(int enemy_x,int enemy_y,int blood,Image enemy) {
		this.enemy_x = enemy_x;
		this.enemy_y = enemy_y;
		this.blood = blood;
		this.enemy = enemy;
	}
	
	//绘制敌机
	public void drawEnemy(Graphics g) {
		g.drawImage(enemy, enemy_x, enemy_y, null);
		enemy_y += enemySpeed;
	}
}