package com.mine.observer;

/**
 * 观察者的具体类（粉丝具体类）
 * @author 曾远洋
 * @time 2019年12月3日下午10:31:00
 * @version V1.0
 */
public class ConcreteFan extends Fan{
	private String fanName;


	public ConcreteFan(String fanName) {
		super();
		this.fanName = fanName;
	}



	@Override
	public void update(String message) {
		System.out.println(fanName + "知道了：" + message + "这条消息！");
	}

}
