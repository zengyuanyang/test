package com.mine.observer;

/**
 * 观察者抽象类(粉丝的抽象类)/也可以写成接口
 * @author 曾远洋
 * @time 2019年12月3日下午10:28:33
 * @version V1.0
 */
public abstract class Fan {
	/**
	 * 当被观察者发生改变时，执行该方法的重写
	 * @param message
	 */
	public abstract void update(String message);
}
