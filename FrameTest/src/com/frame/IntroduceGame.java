package com.frame;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;

public class IntroduceGame extends JPanel {

	/**
	 * Create the panel.
	 */
	public IntroduceGame() {
		setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 10, 561, 621);
		textPane.setText("       ——————全民打飞机游戏介绍——————\r\n\r\n游戏玩法介绍：\r\n\r\n1.战机初始血量为5，被敌机子弹击中或撞击敌机血量减1；\r\n\r\n2.当顶部经验值达到满格时出现Boss，将Boss消灭游戏通关；\r\n\r\n3.战机由鼠标移动控制位移；\r\n\r\n4.点击键盘P键游戏暂停，再次点击游戏继续；\r\n\r\n5.玩家可通过充值提升游戏趣味性。\r\n\r\n\r\n\r\n\r\n游戏开发介绍：\r\n\r\n开发团队：刀疤哥\r\n\r\n游戏版本：V1.1\r\n\r\n开发时间：2019年9月");
		textPane.setFont(new Font("宋体", Font.PLAIN, 20));
		add(textPane);
		
		JButton button = new JButton("返 回 主 菜 单");
		button.setFont(new Font("宋体", Font.BOLD, 20));
		button.setBounds(134, 709, 300, 55);
		add(button);

	}

}
