/**
 * 
 * @author ��Զ��
 * @version �������
 */
public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 9;i++) {  
			if(i <= 5) {	//�ϰ벿��
				for(int j = 5;j > i;j--) {  //�˴�����ͬ����������
				System.out.print(" ");
				}
				for(int k = 0;k < 2*i-1;k++) {  
					System.out.print("*");
				}
				System.out.println();  
			}else {		//�°벿��
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
