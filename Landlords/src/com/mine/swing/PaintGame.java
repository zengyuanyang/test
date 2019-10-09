package com.mine.swing;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.mine.dao.impl.GameTools;
import com.mine.pojo.User;

public class PaintGame {
	
	String userName;
	String userPwd;
	User currentUser = new User();	//当前登录的用户对象
	boolean sureUserName = false;	//用于记录注册时用户名是否正确
	boolean sureUserPwd = false;	//用于记录注册时用户密码是否正确
	ArrayList<User> userList = new ArrayList<User>();		//用户表
	public PaintGame() {
		
	}
	
	public void paintAll() {
		ProjectFrame pf = new ProjectFrame();		//实例化主窗体框架
		MainPanel mp = new MainPanel();				//实例化主界面
		MenuPanel menu = new MenuPanel();			//实例化菜单界面
		LoginPanel login = new LoginPanel();		//实例化登录界面
		RegistPanel regist = new RegistPanel();		//实例化注册界面
		UserMessage message = new UserMessage();	//实例化用户信息界面
		Introduce intr = new Introduce();			//实例化游戏介绍界面
		
		Thread t = new Thread(mp);					//创建线程
		//创建卡片布局对象
		JPanel cards = new JPanel(new CardLayout());		
		CardLayout cl = (CardLayout) cards.getLayout();
		//向卡片布局中添加卡片（页面）
		pf.add(cards);
		cards.add(mp,"cards1");
		cards.add(menu,"cards2");
		cards.add(login,"cards3");
		cards.add(regist,"cards4");
		cards.add(message,"cards5");
		cards.add(intr,"cards6");
		
		cl.show(cards, "cards1");
		//启动线程
		t.start();
		
		//向主界面的按钮1（游客模式）添加监听事件（ActionEvent 事件）
		mp.label_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards2");	//跳转界面2，菜单界面
			}
		});
		
		//向主界面的按钮2（用户登录）添加监听事件（ActionEvent 事件）
		mp.label_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				login.label_8.setVisible(false);
				login.field_1.setText("");
				login.field_2.setText("");
				cl.show(cards, "cards3");	//跳转界面3，用户登录界面
			}
		});
		
		//向主界面的按钮3（用户注册）添加监听事件（ActionEvent 事件）
		mp.label_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//每次点击注册按钮，将输入框清空
				regist.field_1.setText("");
				regist.field_2.setText("");
				regist.field_3.setText("");
				regist.label_9.setVisible(false);
				regist.label_10.setVisible(false);
				regist.label_11.setVisible(false);
				regist.label_12.setVisible(false);
				regist.label_13.setVisible(true);
				regist.label_14.setVisible(true);
				cl.show(cards, "cards4");	//跳转界面4，用户注册界面
			}
		});
		
		//向登录界面的按钮1（登录）添加监听事件（ActionEvent 事件）
		login.button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//验证用户名和密码是否合法（是否存在该用户），如果合法则跳转至MenuPanel页面，跳转前打印标签：登录成功。。。
				//	若不合法，则弹出提示（label_8）,若再次输入时正确则同上并消除提示。
				if(GameTools.isRight(userList, login.field_1.getText(), GameTools.charArrayToString(login.field_2.getPassword()))) {
					currentUser = GameTools.currentUser(userList, login.field_1.getText());
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					cl.show(cards, "cards2");	//跳转界面2，菜单界面
				}else {
					login.label_8.setVisible(true);
				}
			}
		});
		
		//向登录界面的按钮2（返回）添加监听事件（ActionEvent 事件）
		login.button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards1");	//跳转界面1，主界面
			}
		});
		
		//向注册界面的按钮1（注册）添加监听事件（ActionEvent 事件）
		regist.button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//监测两次输入的密码是否一致，如果不一致则弹出提示（label_12）,
				//当密码一致时提示消除，将用户信息存入，并跳转至MenuPanel页面，跳转前打印标签：注册成功。。。
				if(GameTools.charArrayToString(regist.field_2.getPassword()).equals(GameTools.charArrayToString(regist.field_3.getPassword()))) {
					regist.label_12.setVisible(false);
					sureUserPwd = true;
					if(sureUserName == true && sureUserPwd == true) {		//密码和用户名都符合要求时新建对象，并添加到List中
						User newUser = new User();
						newUser.setUserName(userName);
						newUser.setUersPwd(userPwd);
						newUser.setUserID(userList.size()+1);
						userList.add(newUser);
						sureUserName = false;
						sureUserPwd = false;
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
						cl.show(cards, "cards1");	//跳转界面1，主界面
					}
				}else {
					regist.label_12.setVisible(true);
				}
			}
		});
		
		//向注册界面的按钮2（返回）添加监听事件（ActionEvent 事件）
		regist.button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards1");	//跳转界面1，主界面
			}
		});
		
		//向注册界面的输入框1，添加监听事件（FocusEvent 焦点事件）
		regist.field_1.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				//监测用户名是否符合格式要求，如果不符合则弹出提示（label_10）
				//监测用户名是否存在，如果存在弹出提示（label_9）
				String reg = "\\w{4,8}";		//正则表达式，用户名格式
				userName = regist.field_1.getText();		//获取输入框内容
				if(userName.matches(reg)) {
					regist.label_13.setVisible(false);
					regist.label_10.setVisible(false);
					if(GameTools.isExistUser(userList, userName)) {		//判断用户名是否存在
						regist.label_9.setVisible(true);
					}else {
						sureUserName = true;
					}
				}else {
					regist.label_13.setVisible(false);
					regist.label_10.setVisible(true);
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				regist.label_13.setVisible(true);
				regist.label_10.setVisible(false);
				regist.label_9.setVisible(false);
			}
		});
		
		
		//向注册界面的输入框2，添加监听事件（FocusEvent 焦点事件）
		regist.field_2.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				//监测密码是否符合合格要求，如果不符合则弹出提示（label_11）
				String reg = "\\w{6,12}";		//正则表达式，密码格式
				userPwd = GameTools.charArrayToString(regist.field_2.getPassword());
				if(userPwd.matches(reg)) {
					regist.label_14.setVisible(false);
				}else {
					regist.label_11.setVisible(true);
					regist.label_14.setVisible(false);
				}
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				regist.label_14.setVisible(true);
				regist.label_11.setVisible(false);
			}
		});
		
		
		//向菜单界面的按钮1（开始游戏）添加监听事件（ActionEvent 事件）
		menu.button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GamePanel game = new GamePanel();
				cards.add(game,"cards7");
				game.paintCards();
				cl.show(cards, "cards7");  //跳转界面7，游戏界面
			}
		});
		
		//向菜单界面的按钮2（用户信息）添加监听事件（ActionEvent 事件）
		menu.button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards5");	//跳转界面5，用户信息界面
				message.labelID.setText("" + currentUser.getUserID());
				message.labelName.setText(currentUser.getUserName());
				message.labelPwd.setText(currentUser.getUersPwd());
				message.labelMoney.setText("" + currentUser.getMoney());
			}
		});
		
		//向菜单界面的按钮3（游戏介绍）添加监听事件（ActionEvent 事件）
		menu.button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards6");	//跳转界面6，游戏介绍界面
			}
		});
		
		
		//向游戏介绍界面的按钮（返回）添加监听事件（ActionEvent 事件）
		intr.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(cards, "cards2");	//跳转界面2，菜单界面
			}
		});
		
		message.button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards, "cards2");
			}
		});
		
	}

}
