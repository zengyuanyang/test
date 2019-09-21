package com.frame;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MainTest {

	public static void main(String[] args) {
		FrameTest frame = new FrameTest();
		JPanel cards = new JPanel(new CardLayout());
		frame.add(cards);
		JPanelTest1 panel1 = new JPanelTest1();
		JPanelTest2 panel2 = new JPanelTest2();
		JPanelTest3 panel3 = new JPanelTest3();
		cards.add(panel1,"cards1");
		cards.add(panel2,"cards2");
		cards.add(panel3,"cards3");
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, "cards1");
		panel1.button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(cards, "cards2");
			}
		});
		
		panel1.button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(cards, "cards3");
			}
		});
		
		
		panel2.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards1");
			}
		});
		
		panel3.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards1");
			}
		});
		if(panel1.isShowing()) {
			Thread thread = new Thread(panel1);
			thread.start();
		}
	}

}
