package com.event;

import javax.swing.*;
import java.awt.*;

public class EventDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paint2 p2 = new Paint2();
		Thread t = new Thread(p2);
		MainWin mw = new MainWin();
		mw.add(new JScrollBar(JScrollBar.VERTICAL));
		mw.add(p2);
		mw.setVisible(true);
		t.start();
	}

}

class MainWin extends JFrame{	//框架创建
	public MainWin() {
		setBounds(200,200,600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

/*
 * class Paint extends JPanel{ //画笔绘制
 * 
 * @Override public void paintComponent(Graphics g) { ImageIcon ii = new
 * ImageIcon("C:\\Users\\Administrator\\Pictures\\iCloud Photos\\Downloads\\2019\\IMG_4542.JPG"
 * ); g.drawImage(ii.getImage(), 0, 0, this); g.fillOval(150, 150, 100, 100); }
 * }
 * 
 */
 class Paint2 extends JPanel implements Runnable{
	 int y =(int)(Math.random()*500 + 1);
	 int x =(int)(Math.random()*500 + 1);
	 int a = 1;
	 int b = 1;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
		}
	}
	@Override
	public void repaint() {
		// TODO Auto-generated method stub
		super.repaint();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);		//清屏
		ImageIcon ii = new ImageIcon("C:\\Users\\Administrator\\Pictures\\iCloud Photos\\Downloads\\2019\\IMG_4542.JPG");
		g.drawImage(ii.getImage(), x, y,100,100, this);
		x += a;
		y += b;
		if(x == 0) {
			a = (int)(Math.random()*2 + 1) ;
		}
		if(x == 500) {
			a = -(int)(Math.random()*2 + 1);
		}
		if(y == 0) {
			b = (int)(Math.random()*2 + 1);
		}
		if(y == 500) {
			b = -(int)(Math.random()*2 + 1);
		}
		//g.fillOval(150, 150, 100, 100);
	}
 }