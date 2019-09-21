package com.kgc.plane_demo;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
public class Main {
	public static void main(String[] args) {
		MainWindow window = new MainWindow();
		ControlPlaneDemo gamePanel = new ControlPlaneDemo();
		window.add(gamePanel);
		gamePanel.startGame();
		
	}
}

class MyMotionListener implements MouseMotionListener{
	
	//��ק����������Ϊ
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	//�ƶ�����������Ϊ
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
