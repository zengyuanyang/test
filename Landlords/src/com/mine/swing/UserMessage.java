package com.mine.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserMessage extends JPanel{
	JLabel labelTitle;
	JLabel labelID;
	JLabel labelName;
	JLabel labelPwd;
	JLabel labelMoney;
	JButton button;
	public UserMessage() {
		setLayout(null);
		
		labelTitle = new JLabel("当 前 用 户 信 息");
		labelTitle.setForeground(Color.BLACK);
		labelTitle.setFont(new Font("华文琥珀", Font.BOLD, 26));
		labelTitle.setBounds(400, 51, 208, 55);
		add(labelTitle);
		
		JLabel lblNewLabel_1 = new JLabel("用户ID：");
		lblNewLabel_1.setForeground(Color.MAGENTA);
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(309, 168, 103, 45);
		add(lblNewLabel_1);
		
		labelID = new JLabel("");
		labelID.setFont(new Font("宋体", Font.PLAIN, 20));
		labelID.setBounds(463, 168, 217, 45);
		add(labelID);
		
		JLabel label = new JLabel("用户名：");
		label.setForeground(Color.MAGENTA);
		label.setFont(new Font("宋体", Font.PLAIN, 20));
		label.setBounds(309, 247, 103, 45);
		add(label);
		
		labelName = new JLabel("");
		labelName.setFont(new Font("宋体", Font.PLAIN, 20));
		labelName.setBounds(463, 247, 217, 45);
		add(labelName);
		
		JLabel label_2 = new JLabel("用户密码：");
		label_2.setForeground(Color.MAGENTA);
		label_2.setFont(new Font("宋体", Font.PLAIN, 20));
		label_2.setBounds(309, 327, 103, 45);
		add(label_2);
		
		labelPwd = new JLabel("");
		labelPwd.setFont(new Font("宋体", Font.PLAIN, 20));
		labelPwd.setBounds(463, 327, 217, 45);
		add(labelPwd);
		
		JLabel label_4 = new JLabel("用户金币：");
		label_4.setForeground(Color.MAGENTA);
		label_4.setFont(new Font("宋体", Font.PLAIN, 20));
		label_4.setBounds(309, 415, 103, 45);
		add(label_4);
		
		labelMoney = new JLabel("");
		labelMoney.setFont(new Font("宋体", Font.PLAIN, 20));
		labelMoney.setBounds(463, 415, 217, 45);
		add(labelMoney);
		
		button = new JButton("返  回");
		button.setFont(new Font("幼圆", Font.PLAIN, 15));
		button.setForeground(Color.MAGENTA);
		button.setBounds(442, 480, 111, 40);
		button.setBackground(Color.green);
		add(button);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon(".\\src\\com\\mine\\swing\\images\\gamebg2.jpg").getImage();	
		g.drawImage(img, 0, 0, 1005, 538, null);
	}

}
