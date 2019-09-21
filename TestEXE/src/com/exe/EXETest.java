package com.exe;

import javax.swing.*;
import java.awt.*;

public class EXETest {

	public static void main(String[] args) {
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
		setBounds(100,100,1000,800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(".\\image\\IMG_4542.JPG").getImage());
		setResizable(false);
		
	}
}

 class Paint2 extends JPanel implements Runnable{
	 int y1 =(int)(Math.random()*700 + 1);
	 int x1 =(int)(Math.random()*900 + 1);
	 int y2 =(int)(Math.random()*700 + 1);
	 int x2 =(int)(Math.random()*900 + 1);
	 int a = (int)(Math.random()*2 + 1);
	 int b = (int)(Math.random()*2 + 1);
	 int c = (int)(Math.random()*2 + 1);
	 int d = (int)(Math.random()*2 + 1);
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}
	@Override
	public void repaint() {
		super.repaint();
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);		//清屏
		//ImageIcon ii = new ImageIcon(".\\image\\IMG_4542.JPG");
		//g.drawImage(ii.getImage(), x, y,100,100, this);
		g.setColor(Color.blue);
		g.fillOval(x1, y1, 100, 100);
		g.setColor(Color.red);
		g.fillOval(x2, y2, 100, 100);
		
		x1 += a;
		y1 += b;
		x2 += c;
		y2 += d;
		if(x1 <= 0) {
			a = (int)(Math.random()*2 + 1) ;
		}
		if(x1 >= 900) {
			a = -(int)(Math.random()*2 + 1);
		}
		if(y1 <= 0) {
			b = (int)(Math.random()*2 + 1);
		}
		if(y1 >= 700) {
			b = -(int)(Math.random()*2 + 1);
		}
		if(x2 <= 0) {
			c = (int)(Math.random()*2 + 1) ;
		}
		if(x2 >= 900) {
			c = -(int)(Math.random()*2 + 1);
		}
		if(y2 <= 0) {
			d = (int)(Math.random()*2 + 1);
		}
		if(y2 >= 700) {
			d = -(int)(Math.random()*2 + 1);
		}
		if((int)(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) <= 10000) {
			a = -a;
			b = -b;
			c = -c;
			d = -d;
		}
	}
 }