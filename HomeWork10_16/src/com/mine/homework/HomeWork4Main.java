package com.mine.homework;

/**
 * 使用多线程，模拟龟兔赛跑的场景。
     按照以往的故事经验，正确的故事逻辑顺序当然是因为兔子不把乌龟放在眼里，松懈了最终输了比赛。我的设定也是如此，假定乌龟每秒跑五米
     （是有点快但为了线程的运行速度来看还是写快点）兔子的速度为每秒十米。但是兔子在跑到一半休息了一点五秒。
 * @author 曾远洋
 * @time 2019年10月16日下午7:40:29
 * @version V1.0
 */
public class HomeWork4Main {

	public static void main(String[] args) {
		HomeWork4 hw = new HomeWork4();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(hw.getTortle() < 500) {
					hw.tortleRun();
				}
			}
		},"乌龟").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(hw.getRubbit() < 500) {
					if(hw.getRubbit() == 250) {
						try {
							Thread.sleep(1500);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					hw.rubbitRun();
				}
			}
		},"兔子").start();
	}

}
