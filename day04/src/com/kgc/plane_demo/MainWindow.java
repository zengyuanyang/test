package com.kgc.plane_demo;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
/**
 * 窗口
 * @author HuppertY
 * @date2019年9月12日
 */
public class MainWindow extends JFrame{
	
	public MainWindow() {
		init();
		
	}
	private void init() {
		//通过awt工具包类获取屏幕尺寸
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		//将窗口设置在屏幕正中间
		setBounds((screenSize.width-Config.WINDOW_W)/2,
				(screenSize.height-Config.WINDOW_H)/2
				,Config.WINDOW_W ,
				Config.WINDOW_H);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
