/**
 * 
 * @author 曾远洋
 * @version 给20块钱买可乐，每瓶可乐3块钱，喝完之后退瓶子可以换回1块钱，问最多可以喝到多少瓶可乐
 */
public class Exam18_Drink {

	public static void main(String[] args) {
		int count=1;
		int money = 20;
		while(1 == 1) {
			money -= 2;
			if(money >=3) {
				count++;
			
			}else {
				break;
			}
		}
		System.out.println("能喝" + count + "瓶");
	}

}
