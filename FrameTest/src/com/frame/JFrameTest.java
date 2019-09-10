package com.frame;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new FrameDemo();
		JFrame jf = new JFrame("JPanel");
		jf.setBounds(200, 200, 400, 600);
		JPanel jp = new JPanel();
		JLabel jl = new JLabel("JPanel");
		jp.setBackground(Color.RED);
		jf.add(jp);
		jp.add(jl);
		jf.setVisible(true);
		
		
		new FrameDemo2();
	}

}
