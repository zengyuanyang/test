package com.frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelTest1 extends JPanel implements Runnable{
	JLabel lblNewLabel_1 = new JLabel("全");
	JLabel lblNewLabel_2 = new JLabel("民");
	JLabel lblNewLabel_3 = new JLabel("打");
	JLabel lblNewLabel_4 = new JLabel("飞");
	JLabel lblNewLabel_5 = new JLabel("机");
	JButton button_1 = new JButton("开  始  游  戏");
	JButton button_2 = new JButton("游  戏  介  绍");
	JButton button_3 = new JButton("充  值  入  口");
	int x1 = 600;
	int x2 = 600;
	int x3 = 600;
	int x4 = 600;
	int x5 = 600;
	public JPanelTest1() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		lblNewLabel_1.setFont(new Font("华文琥珀", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setForeground(Color.WHITE);
		add(lblNewLabel_1);
		
		lblNewLabel_2.setFont(new Font("华文琥珀", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setForeground(Color.WHITE);
		add(lblNewLabel_2);
		
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("华文琥珀", Font.BOLD | Font.ITALIC, 50));
		add(lblNewLabel_3);
		
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("华文琥珀", Font.BOLD | Font.ITALIC, 50));
		add(lblNewLabel_4);
		
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("华文琥珀", Font.BOLD | Font.ITALIC, 50));
		add(lblNewLabel_5);
		
		button_1.setFont(new Font("宋体", Font.BOLD, 20));
		button_1.setBounds(150, 238, 300, 55);
		
		button_2.setFont(new Font("宋体", Font.BOLD, 20));
		button_2.setBounds(150, 403, 300, 55);
		
		button_3.setFont(new Font("宋体", Font.BOLD, 20));
		button_3.setBounds(150, 560, 300, 55);
	}
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Image bgImg = new ImageIcon(".\\d004_01_b.jpg").getImage();
		g.drawImage(bgImg, 0, 0, null);
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblNewLabel_1.setBounds(x1, 50, 100, 100);
		x1 -= 10;
		if(x1 <= 30) {
			x1 = 30;
		}
		lblNewLabel_2.setBounds(x2, 50, 100, 100);
		if(x1 == 30) {
			x2 -= 10;
		}
		if(x2 <= 130) {
			x2 = 130;
		}
		lblNewLabel_3.setBounds(x3, 50, 100, 100);
		if(x2 == 130) {
			x3 -= 10;
		}
		if(x3 <= 230) {
			x3 = 230;
		}
		lblNewLabel_4.setBounds(x4, 50, 100, 100);
		if(x3 == 230) {
			x4 -= 10;
		}
		if(x4 <= 330) {
			x4 = 330;
		}
		lblNewLabel_5.setBounds(x5, 50, 100, 100);
		if(x4 == 330) {
			x5 -= 10;
		}
		if(x5 <= 430) {
			x5 = 430;
			
		}
		
		if(x5 == 430) {
			this.add(button_1);
			this.add(button_2);
			this.add(button_3);
		}
	}


	@Override
	public void run() {
		while(true) {
			repaint();
		}
		
	}
}
