/*
 * ShowResume.java
 * 2019-7-9
 * 个人简历信息输出
 */
public class ShowResume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 22;                //年龄
		int workTime = 1;            //工作时间
		String name = "曾远洋";      //姓名
		String way = "Java";         //技术方向
		String favorite = "篮球";    //爱好 
		String projectCount = "5";   //做过的项目个数
		
		System.out.println("这个同学的姓名是："+name);
		System.out.println("年龄是："+age);
		System.out.println("工作了"+workTime+"年了");
		System.out.println("做过"+projectCount+"个项目");
		System.out.println("技术方向是："+way);
		System.out.println("兴趣爱好是："+favorite);
	}

}
