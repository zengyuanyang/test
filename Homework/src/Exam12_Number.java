import java.util.Scanner;

/** 
 * 
 * @author ��Զ��
 * @version �ж�һ�����Ƿ�������
 */
public class Exam12_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int i = sc.nextInt();
		int count = 0;
		for(int j = 2;j <= Math.sqrt(i);j++){
			if(i % j == 0){
				count++;
			}
		}
		if(count == 0){
			System.out.println(i + "������");
				
		}else {
			System.out.println(i + "��������");
		}
	}

}
