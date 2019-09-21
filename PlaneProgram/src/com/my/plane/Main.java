package com.my.plane;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.JPanel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 * 程序主入口
 * @author 曾远洋
 * @time 2019年9月18日上午9:45:17
 * @version V1.0
 */
public class Main {
	public static void main(String[] args) {
		playGame();			//调用playGame方法
		while(true) {
			playMusic();	//循环播放背景音乐
		}
	}
	
	/**
	 * 该方法用于各个类的实例化，以及按钮动作事件的监听
	 */
	public static void playGame() {
		WindowPaint winPaint = new WindowPaint();
		//卡片布局
		JPanel cards = new JPanel(new CardLayout());		
		CardLayout cl = (CardLayout) cards.getLayout();
		Menu menu = new Menu();
		PaintControl paintCon = new PaintControl();
		Introduction in = new Introduction();
		Pay pay = new Pay();
		//创建线程
		Thread thread1 = new Thread(paintCon);
		Thread thread2 = new Thread(menu);
		//将JPanel的实例添加至卡片布局
		winPaint.add(cards);
		cards.add(menu,"cards1");
		cards.add(paintCon,"cards2");
		cards.add(in,"cards3");
		cards.add(pay,"cards4");
		//显示cards1，主菜单页面
		cl.show(cards, "cards1");
		//主菜单中按钮1的功能，跳转至cards2
		menu.button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards2");
				
			}
		});
		//主菜单中按钮2的功能，跳转至cards3
		menu.button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards3");
			}
		});
		//主菜单中按钮3的功能，跳转至cards4
		menu.button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards4");
			}
		});
		//介绍页面中按钮的功能，跳转至主页面
		in.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards1");
			}
		});
		//支付页面中按钮的功能，跳转至主页面
		pay.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards1");
			}
		});
		//游戏结束时界面上按钮的功能，跳转至主页面
		paintCon.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards1");
				if(paintCon.gameover == 1 || paintCon.gameover == -1) {
					//去除原始窗口（如果不设置，每次点击开始游戏都会出现新的界面）
					winPaint.dispose();	
					//回调本身
					playGame();
				}
			}
		});
		//启动线程
		thread1.start();
		thread2.start();
	}
	
	/**
	 * 背景音乐播放，使用javazoom.jl.player.Player包中的Player类调用play方法播放音频文件
	 */
	public static void playMusic()  {
		File file = new File(".\\music\\bgmusic.mp3");
		Player p;
		try {
			p = new Player(new FileInputStream(file));
			p.play();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}
}