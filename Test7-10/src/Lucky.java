import java.util.Scanner;                       //导入Scanner类

public class Lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int custNo;                                //客户会员号
		System.out.println("请输入四位会员卡号：");  // 输入会员卡号
		Scanner input = new Scanner(System.in);    //System.in代表键盘
		custNo = input.nextInt();                  //nextInt()获取从键盘输入的一个整数，并赋值给num变量
		System.out.println("会员卡号是："+custNo);
		//利用“/”和“%”运算符获得每位数字
		int gewei = custNo % 10;
		int shiwei = custNo/10 % 10;
		int baiwei = custNo/100 % 10;
		int qianwei = custNo/1000;
		System.out.println("千位数："+qianwei+"，百位数："+baiwei+"，十位数："+shiwei+"，个位数："+gewei);
		int sum = gewei + shiwei + baiwei + qianwei;
		System.out.println("会员卡号"+custNo+"各位之和："+sum);
		//判断是否中奖
		if(sum>20) {
			System.out.println("会员卡号"+custNo+"的会员，您中奖了！奖品是MP3！");
		}else {
			System.out.println("会员卡号"+custNo+"的会员，您没有中奖");
		}
	}

}
