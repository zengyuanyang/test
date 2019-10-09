package com.mine.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Introduce extends JPanel{
	JTextPane textPane;
	JButton button;
	public Introduce() {
		setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setText("             -------------------刀疤斗地主游戏介绍-------------------\r\n\r\n游戏规则介绍:\r\n"
				+ "1、首先是发牌，然后留底三张，在发牌的时候要明着一张牌，就是说水拿到这张牌就是地主，然后你是二打一了。\r\n"
				+ "2、拿到牌后，农民是每人17张，地主是20张。地主先出牌，农民后出牌，然后是两个农民一家，联合打斗地主。\r\n"
				+ "3、只要是一个农民跑掉就赢了。所以农民要配合。地主是很有压力的，不过地主多三张牌也是有优势的。\r\n"
				+ "4、出的时候，对于单牌来说就是大压小，大王最大，3最小。然后其他的就是依次压。对于双来说也是大压小，不过大王和小王不是一对。重要的是三个咋出？对于三个也是大压小，但是能够带个单牌或者一对。你在压的时候只需要把三个的压住就可以了，不需要把带的压住。\r\n"
				+ "5、对于四个的就是炸弹，还有就是两个王是最大的，可以压住2222.炸弹一出是要翻倍的。还有就是4个可以带两个单或者两个对。\r\n"
				+ "6、对于连牌来说是最少五张，2不能连。还有就是飞机，飞机的意思就是说，至少两个三牌连在一起出，这就叫飞机。这个你在压的时候就必须用一样的牌压住，或者是直接炸弹。\r\n\r\n游戏制作团队介绍：\r\n\t"
				+ "制作团队： 刀疤哥\r\n\t制作时间：新中国成立第七十周年\r\n\t游戏版本：V1.0");
		textPane.setFont(new Font("宋体", Font.PLAIN, 18));
		textPane.setBounds(125, 5, 755, 470);
		add(textPane);
		
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
