import java.io.IOException;

/**
 * 三国争霸游戏执行入口
 * @author 曾远洋
 * @version V1.0
 */
public class PlayGame {

	public static void main(String[] args) throws IOException, InterruptedException {
		GameTools tools = new GameTools();	//创建GameTools类对象
		tools.cls();	//调用GameTools类中的cls（）清屏方法
		Face face = new Face();		//创建Face类对象
		face.showMain();	//调用showMain方法
	}

}
