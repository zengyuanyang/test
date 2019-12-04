package com.mine.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者抽象类
 * @author 曾远洋
 * @time 2019年12月3日下午10:36:32
 * @version V1.0
 */
public abstract class Idol {
	protected List<Fan> list = new ArrayList<Fan>();//存放观察者
	
	//添加粉丝
	public void addFan(Fan fan) {
		list.add(fan);
	}
	
	//删除粉丝
	public void delFan(Fan fan) {
		list.remove(fan);
	}
	
	
	//通知粉丝
	public abstract void notifyFan(String message);
	
}
