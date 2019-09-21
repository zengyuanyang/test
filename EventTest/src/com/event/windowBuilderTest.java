package com.event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Toolkit;

public class windowBuilderTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					windowBuilderTest window = new windowBuilderTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public windowBuilderTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setOpacity(0.1f);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Administrator\\Pictures\\iCloud Photos\\Downloads\\2019\\IMG_4208.JPG"));
		frame.setBounds(100, 100, 396, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("button1");
		btnNewButton.setBounds(0, 0, 214, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnButton = new JButton("button2");
		btnButton.setBounds(0, 74, 214, 49);
		frame.getContentPane().add(btnButton);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setBounds(353, 0, -9, 397);
		frame.getContentPane().add(scrollBar_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(353, 0, 17, 459);
		frame.getContentPane().add(scrollBar);
	}
}
