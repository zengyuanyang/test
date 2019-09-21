package com.my.plane;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * 游戏支付界面
 * @author 曾远洋
 * @time 2019年9月21日下午4:25:36
 * @version V1.0
 */
public class Pay extends JPanel{
	JButton button = new JButton("返 回 主 菜 单");
	
	public Pay() {
		setLayout(null);
		
		button.setFont(new Font("宋体", Font.BOLD, 20));
		button.setBounds(134, 709, 300, 50);
		add(button);
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon(".\\images\\pay.jpg").getImage();
		g.drawImage(img, 0, 0, 600, 709, null);
	}
}