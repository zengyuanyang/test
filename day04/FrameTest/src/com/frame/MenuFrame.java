package com.frame;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class MenuFrame extends JPanel {

	/**
	 * Create the panel.
	 */
	public MenuFrame() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel(" 全   民   ");
		lblNewLabel.setFont(new Font("华文琥珀", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(44, 44, 206, 100);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("打   飞   机");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("华文琥珀", Font.BOLD | Font.ITALIC, 50));
		lblNewLabel_1.setBounds(249, 44, 351, 100);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("开  始  游  戏");
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 20));
		btnNewButton.setBounds(150, 238, 300, 55);
		add(btnNewButton);
		
		JButton button = new JButton("游  戏  介  绍");
		button.setFont(new Font("宋体", Font.BOLD, 20));
		button.setBounds(150, 403, 300, 55);
		add(button);
		
		JButton button_1 = new JButton("充  值  入  口");
		button_1.setFont(new Font("宋体", Font.BOLD, 20));
		button_1.setBounds(150, 560, 300, 55);
		add(button_1);
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		Image bgImg = new ImageIcon("C:\\Users\\Administrator\\Desktop\\中秋大礼包\\img\\d004_01_b.jpg").getImage();
		g.drawImage(bgImg, 0, 0, null);
	}
}
