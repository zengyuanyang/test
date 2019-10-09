package com.mine.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel implements Runnable{
	JButton label_1;
	JButton label_2;
	JButton label_3;
	JLabel label_4;
	JLabel label_5;
	JLabel label_6;
	JLabel label_7;
	JLabel label_8;
	int x4 = 1050;
	int x5 = 1050;
	int x6 = 1050;
	int x7 = 1050;
	int x8 = 1050;
	public MainPanel() {
		setBackground(Color.WHITE);
		setLayout(null);
		label_1 = new JButton("游客模式");
		label_1.setForeground(Color.MAGENTA);
		label_1.setFont(new Font("幼圆", Font.PLAIN, 15));
		label_1.setBounds(442, 264, 111, 40);
		label_1.setBackground(Color.green);
		label_1.setVisible(false);
		add(label_1);
		
		label_2 = new JButton("玩家登陆");
		label_2.setFont(new Font("幼圆", Font.PLAIN, 15));
		label_2.setForeground(Color.MAGENTA);
		label_2.setBounds(442, 334, 111, 40);
		label_2.setBackground(Color.green);
		label_2.setVisible(false);
		add(label_2);
		
		label_3 = new JButton("玩家注册");
		label_3.setFont(new Font("幼圆", Font.PLAIN, 15));
		label_3.setForeground(Color.MAGENTA);
		label_3.setBounds(442, 404, 111, 40);
		label_3.setBackground(Color.green);
		label_3.setVisible(false);
		add(label_3);
		
		label_4 = new JLabel("刀");
		label_4.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		add(label_4);
		
		label_5 = new JLabel("疤");
		label_5.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		add(label_5);
		
		label_6 = new JLabel("斗");
		label_6.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		add(label_6);
		
		label_7 = new JLabel("地");
		label_7.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		add(label_7);
		
		label_8 = new JLabel("主");
		label_8.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		add(label_8);
		
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image img = new ImageIcon(".\\src\\com\\mine\\swing\\images\\gamebg2.jpg").getImage();	
		g.drawImage(img, 0, 0, 1005, 538, null);
		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		label_4.setBounds(x4, 76, 100, 100);
		x4 -= 10;
		if(x4 <= 84) {
			x4 = 84;
		}
		label_5.setBounds(x5, 76, 100, 100);
		if(x4 == 84) {
			x5 -= 10;
		}
		if(x5 <= 264) {
			x5 = 264;
		}
		label_6.setBounds(x6, 76, 100, 100);
		if(x5 == 264) {
			x6 -= 10;
		}
		if(x6 <= 448) {
			x6 = 448;
		}
		label_7.setBounds(x7, 76, 100, 100);
		if(x6 == 448) {
			x7 -= 10;
		}
		if(x7 <= 632) {
			x7 = 632;
		}
		label_8.setBounds(x8, 76, 100, 100);
		if(x7 == 632) {
			x8 -= 10;
		}
		if(x8 <= 816) {
			x8 = 816;
		}
		
		if(x8 == 816) {
			label_1.setVisible(true);
			label_2.setVisible(true);
			label_3.setVisible(true);
		}
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
				repaint();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
