package com.event;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EventDemo1 extends JFrame{
	JList list;
	JLabel label;
	JButton button1;
	int clicks = 0;
	public EventDemo1() {
		setTitle("动作事件监听器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		JPanel jp = new JPanel();
		jp.setBorder(new EmptyBorder(5,5,5,5));
		jp.setLayout(new BorderLayout(0, 0));
		setContentPane(jp);			//相当于add(jp)
		label = new JLabel(" ");
		label.setFont(new Font("楷体",Font.BOLD,16));
		jp.add(label,BorderLayout.SOUTH);
		button1 = new JButton("我是普通按钮");
		button1.setFont(new Font("黑体",Font.BOLD,16));
		button1.addActionListener(new ActionListener() {	//或者button1.addActionListener(new button1ActionListener);
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("按钮被点击了" + (clicks++) + "次");
			}
		});
		jp.add(button1);
		setVisible(true);
	}
	class button1ActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setText("按钮被点击了" + (clicks++) + "次");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EventDemo1();
	}

}
