package com.kgc.plane_demo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Config {
	public static final int WINDOW_W =640 ;//窗口宽
	public static final int WINDOW_H = 750;//窗口高
	public static final int BG_START_POSITION_Y = WINDOW_H-1750;//背景1起始位置
	public static final int BG2_START_POSITION_Y =WINDOW_H-1750-1750;//背景2起始位置
	public static final int MY_PLANE_H =133 ;//飞机高
	public static final int  MY_PLANE_W=112;//飞机宽
	public final static String[] IMAGE_ARRAY_ENEMY= {
			"img\\enemy1.png", "img\\enemy1.png",
			"img\\enemy2.png", "img\\enemy2.png",
			"img\\enemy3.png", "img\\enemy3.png",
			"img\\enemy4.png", "img\\enemy4.png",
			"img\\enemy5.png", "img\\enemy5.png",
			"img\\enemy6.png", "img\\enemy6.png",
			"img\\enemy7.png", "img\\enemy7.png",
			"img\\enemy8.png", "img\\enemy8.png",
			"img\\enemy9.png", "img\\enemy9.png",
			"img\\enemy10.png", "img\\enemy10.png",			 
	};
	public static Image[] getEnemyImgs(){
		Image[] imgs =new Image[IMAGE_ARRAY_ENEMY.length];
		for(int i=0; i<IMAGE_ARRAY_ENEMY.length; i++) {
			imgs[i] = new ImageIcon(IMAGE_ARRAY_ENEMY[i]).getImage();
		}
		return imgs;
	}
}
