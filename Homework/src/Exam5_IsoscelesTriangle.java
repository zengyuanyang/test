/**
 * 
 * @author ��Զ��
 * @version ��for��һ������������
 */
public class Exam5_IsoscelesTriangle {

	public static void main(String[] args) {
		for(int i = 1;i <= 5;i++) {  
			for(int j = 5;j > i;j--) {  
				System.out.print(" ");
			}
			for(int k = 0;k < 2*i-1;k++) {  
				System.out.print("*");
			}
			System.out.println();  
		}
	}

}
