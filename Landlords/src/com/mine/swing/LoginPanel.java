package com.mine.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel extends JPanel{

	JLabel label_1;
	JLabel label_2;
	JLabel label_3;
	JLabel label_4;
	JLabel label_5;
	JLabel label_6;
	JLabel label_7;
	JLabel label_8;
	JTextField field_1;
	JPasswordField field_2;
	JButton button_1;
	JButton button_2;
	public LoginPanel() {
		setLayout(null);
		
		label_1 = new JLabel("刀");
		label_1.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_1.setBounds(84, 38, 100, 100);
		add(label_1);
		
		label_2 = new JLabel("疤");
		label_2.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_2.setBounds(264, 38, 100, 100);
		add(label_2);
		
		label_3 = new JLabel("斗");
		label_3.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_3.setBounds(448, 38, 100, 100);
		add(label_3);
		
		label_4 = new JLabel("地");
		label_4.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_4.setBounds(632, 38, 100, 100);
		add(label_4);
		
		label_5 = new JLabel("主");
		label_5.setFont(new Font("华文琥珀", Font.PLAIN, 99));
		label_5.setBounds(816, 38, 100, 100);
		add(label_5);
		
		label_6 = new JLabel("用 户 名：");
		label_6.setForeground(Color.MAGENTA);
		label_6.setFont(new Font("宋体", Font.PLAIN, 20));
		label_6.setBounds(318, 205, 107, 51);
		add(label_6);
		
		label_7 = new JLabel("密    码：");
		label_7.setForeground(Color.MAGENTA);
		label_7.setFont(new Font("宋体", Font.PLAIN, 20));
		label_7.setBounds(318, 289, 107, 51);
		add(label_7);
		
		label_8 = new JLabel("用户名或密码错误，请重新登录！");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("宋体", Font.PLAIN, 20));
		label_8.setBounds(345, 171, 300, 36);
		label_8.setVisible(false);
		add(label_8);
		
		field_1 = new JTextField();
		field_1.setBounds(435, 217, 234, 28);
		add(field_1);
		
		field_2 = new JPasswordField();
		field_2.setBounds(435, 300, 234, 28);
		add(field_2);
		
		button_1 = new JButton("登  录");
		button_1.setBackground(Color.GREEN);
		button_1.setForeground(Color.MAGENTA);
		button_1.setFont(new Font("宋体", Font.PLAIN, 20));
		button_1.setBounds(318, 399, 163, 44);
		add(button_1);
		
		button_2 = new JButton("返  回");
		button_2.setForeground(Color.MAGENTA);
		button_2.setFont(new Font("宋体", Font.PLAIN, 20));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(506, 399, 163, 44);
		add(button_2);
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon(".\\src\\com\\mine\\swing\\images\\gamebg2.jpg").getImage();	
		g.drawImage(img, 0, 0, 1005, 538, null);
	}
}
