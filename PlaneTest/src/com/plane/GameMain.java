package com.plane;
/**
 * 游戏入口
 * @author 曾远洋
 * @time 2019年9月12日上午10:29:27
 * @version V1.0
 */
public class GameMain {

	public static void main(String[] args) {
		MainPaint mp = new MainPaint();
		MoveBackground mb = new MoveBackground();
		mb.addMouseMotionListener(mb);
		Thread t = new Thread(mb);
		mp.add(mb);
		t.start();
	}

}
