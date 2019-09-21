package com.my.plane;

import java.awt.Color;
import java.awt.Graphics;
/**
 * 血条经验条实体类
 * @author 曾远洋
 * @time 2019年9月18日上午9:50:12
 * @version V1.0
 */
public class BloodAndExperience {
	int x;
	int y;
	int width;
	int height;
	
	public BloodAndExperience() {}
	
	public BloodAndExperience(int x,int y,int width,int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void draw(Graphics g,Color c) {
		g.setColor(c);
		g.fillRect(x, y, width, height);
	}
}