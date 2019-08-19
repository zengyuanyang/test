
public class Cheng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 1;
		double count = 2.5;
		while(count < 100) {
			day++;
			count += 2.5;
			if(day%5 == 0) {
				count = count - 6;
			}
			System.out.println("第" + day + "天，钱为：" + count);
		}
		System.out.println("存到100元至少要：" + day + "天！");
	}

}
