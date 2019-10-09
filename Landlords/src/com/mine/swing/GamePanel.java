package com.mine.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.mine.dao.impl.GameTools;
import com.mine.pojo.Cards;


public class GamePanel extends JPanel{
	Cards cards = new Cards();
	JButton button_1;
	JButton button_2;
	public GamePanel() {
		setLayout(null);
		
		button_1 = new JButton("出 牌");
		button_1.setBounds(380, 300,80, 20);
		button_1.setBackground(Color.GREEN);
		add(button_1);
		
		button_2 = new JButton("不 要");
		button_2.setBounds(520, 300,80, 20);
		button_2.setBackground(Color.GREEN);
		add(button_2);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon(".\\src\\com\\mine\\swing\\images\\gamebg1.jpg").getImage();	
		g.drawImage(img, 0, 0, 1005, 538, null);
	}

	public void paintCards() {
		for(int i = cards.getMyCardsList().size()-1;i >= 0;i--) {
			JLabel label = GameTools.cardsLabel(i*20+300, cards.getMyCardsList(), cards.getAllCards(), i);
			this.add(label);
			
		}
	}
}
