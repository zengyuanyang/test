import java.util.Scanner;

/**
 * @version ��ϰ3-1
 * @author ��Զ��
 *
 */
public class max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max,min,in;
		Scanner input = new Scanner(System.in);
		System.out.println("������һ������������0��������");
		in = input.nextInt();
		max = in;
		min = in;
		do {
			System.out.println("������һ������������0��������");
			in = input.nextInt();
			if(in != 0) {
				if(in >= max) {
					max = in;
				}else if(in <= min){
					min = in;
				}
			}else {
				break;
			}
		}while(true);
		System.out.println("���ֵ�ǣ�" + max + " ��Сֵ�ǣ�" + min);
		input.close();
	}

}
