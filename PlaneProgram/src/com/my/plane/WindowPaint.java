package com.my.plane;

import javax.swing.JFrame;

/**
 * 游戏frame框架
 * @author 曾远洋
 * @time 2019年9月21日下午4:28:37
 * @version V1.0
 */
public class WindowPaint extends JFrame{

	public WindowPaint() {
		setBounds(0, 0, 600, 800);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);	//设置大小不可变
		setVisible(true);
	}
}
