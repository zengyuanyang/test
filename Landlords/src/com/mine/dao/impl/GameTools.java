package com.mine.dao.impl;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.mine.pojo.User;

public class GameTools {

	private GameTools() {
	}
	//验证用户是否存在
	public static boolean isExistUser(ArrayList<User> userList, String userInput) {
		boolean exist = false;
		for (User user: userList) {
			if(user.getUserName().equals(userInput)) {
				exist = true;
				break;
			}
		}
		return exist;
	}
	
	//将密码的字符数组转为字符串(Arrays类中的toString方法不能满足需求)
	public static String charArrayToString(char[] arr) {
		String str = "";
		for (char c : arr) {
			str = str + c;
		}
		return str;
	}
	
	//判断用户登录时输入的用户名和密码是否正确
	public static boolean isRight(ArrayList<User> user,String name,String pwd) {
		boolean isRight = false;
		for (User u : user) {
			if(u.getUserName().equals(name) && u.getUersPwd().equals(pwd)) {
				isRight = true;
				break;
			}
		}
		return isRight;
	}
	
	//获取当前用户对象
	public static User currentUser(ArrayList<User> user,String name) {
		User currentUser = null;
		for (User u : user) {
			if(u.getUserName().equals(name)) {
				currentUser = u;
				break;
			}
		}
		return currentUser;
		
	}
	
	public static JLabel cardsLabel(int x,ArrayList<String> myCardsList,HashMap<String,String> allCards,int i) {
		JLabel cardsLabel = new JLabel("");
		ImageIcon icon = null;
		cardsLabel.setBounds(x, 400, 80, 114);
		for(Map.Entry<String, String> m : allCards.entrySet()) {
			if(m.getKey().equals(myCardsList.get(i))) {
				icon = new ImageIcon(m.getValue());
			}
		}
		cardsLabel.setIcon(icon);
		cardsLabel.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				if(cardsLabel.getY() == 400) {
					cardsLabel.setLocation(x, 370);
					 
				}else {
					cardsLabel.setLocation(x, 400);
				}
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		return cardsLabel;
		
	}
}
