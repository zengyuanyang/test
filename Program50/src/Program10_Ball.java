/**
 * 
 * @author 曾远洋
 * @version 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class Program10_Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double jg = 100;
		double ft = 50;
		System.out.println("第1次反弹高度为：" + ft + "m，经过：" + jg + "m。");
		for(int i =  2;i <= 10;i++) {
			jg = jg + ft*2;
			ft = ft/2;
			System.out.println("第" + i + "次反弹高度为：" + ft + "m，经过：" + jg + "m。");
		}
	}

}
