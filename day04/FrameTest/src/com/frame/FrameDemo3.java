package com.frame;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//卡片布局
public class FrameDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf = new JFrame("卡片布局");		//创建框架对象
		jf.setBounds(300, 200, 300, 600);		//设置框架位置及大小
		jf.setVisible(true);					//设置可视化
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//关闭方式
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel cards = new JPanel(new CardLayout());		//声明卡片布局的容器对象
		jp1.add(new JButton("开始"));						//添加按钮
		jp1.add(new JButton("结束"));	
		jp2.add(new JLabel("第二页"));
		jp1.setBackground(Color.BLUE);						//设置背景色
		jp2.setBackground(Color.red);
		cards.add(jp1, "card1");							//将页面加入cards容器中
		cards.add(jp2, "card2");
		CardLayout cl = (CardLayout)(cards.getLayout());	//创建卡片布局对象
		jf.add(cards);										//将将添加有页面的cards容器添加至框架中
		cl.show(cards, "card1");							//show方法显示页面
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cl.show(cards, "card2");
	}

}
