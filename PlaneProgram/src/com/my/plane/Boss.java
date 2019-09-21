package com.my.plane;

import java.awt.Graphics;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.ImageIcon;

/**
 * boss实体类
 * @author 曾远洋
 * @time 2019年9月18日上午9:50:34
 * @version V1.0
 */
public class Boss {
	Image bossImage = new ImageIcon(".\\images\\boss1.png").getImage();
	//Boss坐标
	int x = 300 - bossImage.getWidth(null)/2;
	int y = -bossImage.getHeight(null);
	//Boss血量
	int bossBlood = 100;
	//Boss的僚机子弹密度
	int bossEnemyBulletDensity = 50;
	//记录绘制次数
	int paintCount = 0;
	//僚机血量
	int bossEnemyBlood = 20;
	//实体类链表
	LinkedList<Enemy> bossEnemyList = new LinkedList<Enemy>();
	LinkedList<Bullet> bossEnemyBulletList = new LinkedList<Bullet>();
	
	//构造方法中初始化Boss的僚机
	public Boss() {
		Image img = new ImageIcon(".\\images\\enemy6.png").getImage();
		bossEnemyList.add(new Enemy(x-50, y-50, bossEnemyBlood, img));
		bossEnemyList.add(new Enemy(x+294-50, y-50, bossEnemyBlood, img));
		bossEnemyList.add(new Enemy(x-50, y+160-50, bossEnemyBlood, img));
		bossEnemyList.add(new Enemy(x+294-50, y+160-50, bossEnemyBlood, img));
	}
	
	//绘制Boss
	public void drawBoss(Graphics g) {
		g.drawImage(bossImage, x, y, null);
		if(y <= 100) {
			y += 2;
		}
		drawBossEnemy(g);
		if(paintCount % bossEnemyBulletDensity == 0) {
			newEnemyBullet(3);
		}
		drawEnemyBullet(g);
		paintCount++;
	}
	
	//绘制僚机
	public void drawBossEnemy(Graphics g) {
		for(int i = 0 ;i < bossEnemyList.size() ;i++) {
			Enemy bossEnemy = bossEnemyList.get(i);
			g.drawImage(bossEnemy.enemy, bossEnemy.enemy_x, bossEnemy.enemy_y, null);
			//使僚机以矩形运动轨迹绕着Boss运动
			if(y <= 100) {
				bossEnemy.enemy_y+=2;
			}else {
				if(bossEnemy.enemy_x <= 128) {
					bossEnemy.enemy_x = 128;
					bossEnemy.enemy_y -= 2;
				}else if(bossEnemy.enemy_x >= 422) {
					bossEnemy.enemy_x = 422;
					bossEnemy.enemy_y += 2;
				}
				if(bossEnemy.enemy_y <= 50) {
					bossEnemy.enemy_y = 50;
					bossEnemy.enemy_x += 2;
				}else if(bossEnemy.enemy_y >= 260) {
					bossEnemy.enemy_y = 260;
					bossEnemy.enemy_x -= 2;
				}
			}
		}
	}
	
	//创建Boss僚机子弹
	public void newEnemyBullet(int enemyBulletSpeed) {
		Image bullet = new ImageIcon(".\\images\\enemyBullet.png").getImage();
		for(int i = 0; i < bossEnemyList.size();i++) {
			Enemy e = bossEnemyList.get(i);
			bossEnemyBulletList.add(new Bullet(e.enemy_x + e.enemy.getWidth(null)/2 - bullet.getWidth(null)/2,e.enemy_y + e.enemy.getHeight(null), enemyBulletSpeed, bullet));
		}
		
	}
	
	//绘制Boss僚机子弹
	public void drawEnemyBullet(Graphics g) {
		for(int i = 0; i < bossEnemyBulletList.size();i++) {
			Bullet b = bossEnemyBulletList.get(i);
			if(b.bullet_y > 800 ) {
				bossEnemyBulletList.remove(i);
			}
			b.drawBullet(g);
		}
	}
}