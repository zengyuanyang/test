package com.mine.swing;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;

public class MainPanelTest extends JPanel {
	
	public MainPanelTest() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainPanelTest.class.getResource("/com/mine/swing/images/A1.jpg")));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(108, 401, 80, 114);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(MainPanelTest.class.getResource("/com/mine/swing/images/B1.jpg")));
		lblNewLabel_1.setBounds(90, 401, 80, 114);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(MainPanelTest.class.getResource("/com/mine/swing/images/A1.jpg")));
		btnNewButton.setBounds(62, 157, 108, 114);
		add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setIcon(new ImageIcon(MainPanelTest.class.getResource("/com/mine/swing/images/A2.jpg")));
		button.setBounds(108, 157, 108, 114);
		add(button);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(MainPanelTest.class.getResource("/com/mine/swing/images/C1.jpg")));
		label.setBackground(Color.BLACK);
		label.setBounds(67, 401, 80, 114);
		add(label);
		
		
		
	}
	
	
	@Override
	public void paintComponent(Graphics g) {
		Image img = new ImageIcon(".\\src\\com\\mine\\swing\\images\\gamebg1.jpg").getImage();	
		g.drawImage(img, 0, 0, 1005, 538, null);
	}
}
