package com.mine.swing;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ProjectFrame extends JFrame{
	
	public ProjectFrame() {
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize(); 
		int width=dim.width; 
		int height=dim.height;
		setBounds(width/6, height/6, width*2/3, height*2/3);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}

}
