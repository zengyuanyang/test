package com.frame;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class JPanelTest3 extends JPanel{
	JButton button = new JButton("返 回 主 菜 单");
	public JPanelTest3() {
		setLayout(null);
		
		button.setFont(new Font("宋体", Font.BOLD, 20));
		button.setBounds(134, 709, 300, 50);
		add(button);
		repaint();
	}
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon(".\\pay.jpg").getImage();
		g.drawImage(img, 0, 0, 600, 709, null);
	}

}
