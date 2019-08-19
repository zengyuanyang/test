/**
 * 
 * @author 曾远洋
 * @version 输出直角三角形
 */
public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i < 5;i++){	//外层循环
			for(int j = 0;j < i+1;j++) {  //内层循环，判断条件语句与外层i有关
				System.out.print("*");
			}
			System.out.println();    //外层循环每次结束时实现换行；
		}
	}

}
