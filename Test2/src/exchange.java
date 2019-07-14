/**
 * @version 练习2-2
 * @author 曾远洋
 *
 */
public class exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left,right,center;
		left = 10;
		right = 8;
		System.out.println("输出互换前手中的纸牌：");
		System.out.println("左手中的纸牌：" + left);
		System.out.println("右手中的纸牌：" + right);
		System.out.println();
		 //互换变量中的值
		center = left;
		left = right;
		right = center;
		System.out.println("输出互换后手中的纸牌：");
		System.out.println("左手中的纸牌：" + left);
		System.out.println("右手中的纸牌：" + right);
	}

}
