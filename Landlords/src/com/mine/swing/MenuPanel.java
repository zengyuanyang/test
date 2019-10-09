package com.mine.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuPanel extends JPanel{
	JButton button_1;
	JButton button_2;
	JButton button_3;
	JLabel label_4;
	JLabel label_5;
	JLabel label_6;
	JLabel label_7;
	JLabel label_8;
	public MenuPanel() {
		setBackground(Color.WHITE);
		setLayout(null);
		button_1 = new JButton("开始游戏");
		button_1.setForeground(Color.MAGENTA);
		button_1.setFont(new Font("幼圆", Font.PLAIN, 15));
		button_1.setBounds(442, 264, 111, 40);
		button_1.setBackground(Color.green);
		add(button_1);
		
		button_2 = new JButton("用户信息");
		button_2.setFont(new Font("幼圆", Font.PLAIN, 15));
		button_2.setForeground(Color.MAGENTA);
		button_2.setBounds(442, 334, 111, 40);
		button_2.setBackground(Color.green);
		add(button_2);
		
		button_3 = new JButton("游戏介绍");
		button_3.setFont(new Font("幼圆", Font.PLAIN, 15));
		button_3.setForeground(Color.MAGENTA);
		button_3.setBounds(442, 404, 111, 40);
		button_3.setBackground(Color.green);
		add(button_3);
		
		label_4 = new JLabel("刀");
		label_4.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_4.setBounds(84, 76, 100, 100);
		add(label_4);
		
		label_5 = new JLabel("疤");
		label_5.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_5.setBounds(264, 76, 100, 100);
		add(label_5);
		
		label_6 = new JLabel("斗");
		label_6.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_6.setBounds(448, 76, 100, 100);
		add(label_6);
		
		label_7 = new JLabel("地");
		label_7.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_7.setBounds(632, 76, 100, 100);
		add(label_7);
		
		label_8 = new JLabel("主");
		label_8.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_8.setBounds(816, 76, 100, 100);
		add(label_8);
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon(".\\src\\com\\mine\\swing\\images\\gamebg2.jpg").getImage();	
		g.drawImage(img, 0, 0, 1005, 538, null);
	}

}
