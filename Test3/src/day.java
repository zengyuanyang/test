import java.util.Scanner;

/**
 * @version ��ϰ3-2
 * @author ��Զ��
 *
 */
public class day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int in;
		do {
			System.out.print("����������1-7������0������");
			in = input.nextInt();
			if(in == 0) {
				break;
			}else if(in >= 1 && in <= 7){
				switch(in) {
				case 1:
					System.out.println("������MON");
					break;
				case 2:
					System.out.println("������TUE");
					break;
				case 3:
					System.out.println("������WED");
					break;
				case 4:
					System.out.println("������THU");
					break;
				case 5:
					System.out.println("������FRI");
					break;
				case 6:
					System.out.println("������SAT");
					break;
				case 7:
					System.out.println("������SUN");
					break;
				}
			}else {
				System.out.println("����ȷ���룡");
			}
		}while(true);
		System.out.println("���������");
		input.close();
	}

}
