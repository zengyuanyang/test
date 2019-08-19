/**
 * 
 * @author 曾远洋
 * @version 输出菱形
 */
public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 9;i++) {  
			if(i <= 5) {	//上半部分
				for(int j = 5;j > i;j--) {  //此处方法同等腰三角形
				System.out.print(" ");
				}
				for(int k = 0;k < 2*i-1;k++) {  
					System.out.print("*");
				}
				System.out.println();  
			}else {		//下半部分
				for(int j = 5;j < i;j++) {
					System.out.print(" ");
				}
				for(int k = 9;k > (i-5)*2;k--) {  
					System.out.print("*");
				}
				System.out.println();  
			}
			
		}
	}

}
