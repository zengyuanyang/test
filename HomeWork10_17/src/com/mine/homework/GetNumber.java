package com.mine.homework;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 每隔1s，取出1-13的1个数字，不能重复。
 * @author 曾远洋
 * @time 2019年10月17日下午6:04:25
 * @version V1.0
 */
public class GetNumber {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int k;
		while(true) {
			k = (int)(Math.random()*13+1);
			if(!list.contains(k)) {
				list.add(k);
			}
			if(list.size() == 13) {
				break;
			}
		}
		Timer time = new Timer();
		time.schedule(new TimerTask() {
			int i = 0;
			@Override
			public void run() {
				System.out.println(list.get(i));
				i++;
				if(i == 13) {
					time.cancel();
				}
			}
		}, 1000, 1000);
	}

}
