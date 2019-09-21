package com.kgc.plane_demo;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
/**
 * ����
 * @author HuppertY
 * @date2019��9��12��
 */
public class MainWindow extends JFrame{
	
	public MainWindow() {
		init();
		
	}
	private void init() {
		//ͨ��awt���߰����ȡ��Ļ�ߴ�
		Dimension screenSize=Toolkit.getDefaultToolkit().getScreenSize();
		//��������������Ļ���м�
		setBounds((screenSize.width-Config.WINDOW_W)/2,
				(screenSize.height-Config.WINDOW_H)/2
				,Config.WINDOW_W ,
				Config.WINDOW_H);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
