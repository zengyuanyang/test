package com.frame;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameDemo extends JFrame{

	public FrameDemo() {
		setTitle("Java JFrame练习");
		setSize(400,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel jl = new JLabel("这是窗口");
		Container c = getContentPane();
		c.add(jl);
		setVisible(true);
	}

}
