package com.mine.observer;


/**
 * 具体的目标类
 * @author 曾远洋
 * @time 2019年12月3日下午10:44:30
 * @version V1.0
 */
public class ConcreteIdol extends Idol{

	@Override
	public void notifyFan(String message) {
		// TODO Auto-generated method stub
		for(Fan fan : list) {
			fan.update(message);
		}
	}

}
