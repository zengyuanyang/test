package com.frame;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameDemo2 extends JFrame{

	public FrameDemo2() {
		// TODO Auto-generated constructor stub
		setTitle("布局");
		setSize(400, 600);
		setLayout(new BorderLayout());
		JButton b1 = new JButton("上");
		JButton b2 = new JButton("左");
		JButton b3 = new JButton("中");
		JButton b4 = new JButton("下");
		JButton b5 = new JButton("右");
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.WEST);
		add(b3, BorderLayout.CENTER);
		add(b4, BorderLayout.SOUTH);
		add(b5, BorderLayout.EAST);
		setBounds(300, 200, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
