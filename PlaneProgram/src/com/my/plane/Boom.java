package com.my.plane;

import java.awt.Graphics;
import java.awt.Image;
/**
 * 爆炸实体类
 * @author 曾远洋
 * @time 2019年9月18日上午9:46:09
 * @version V1.0
 */
public class Boom {
	//记录绘制次数
	int drawCount = 0;
	//爆炸效果的坐标
	int boom_x;
	int boom_y;
	Image boom;
	
	public Boom() {}
	
	public Boom(int boom_x,int boom_y,Image boom) {
		this.boom_x = boom_x;
		this.boom_y = boom_y;
		this.boom = boom;
	}
	
	public void drawBoom(Graphics g) {
		g.drawImage(boom, boom_x, boom_y, null);
		drawCount++;
	}
}