import java.util.Scanner;

/**
 * @version ��ϰ3-3
 * @author ��Զ��
 *
 */
public class airplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month,canghao;
		int cost = 5000;
		double price;
		Scanner input = new Scanner(System.in);
		System.out.println("�����������е��·ݣ�1~12");
		month = input.nextInt();
		System.out.println("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2");
		canghao = input.nextInt();
		if(month >= 4 && month <= 10) {
			if(canghao == 1) {
				price = cost * 0.9;
			}else {
				price = cost * 0.6;
			}
		}else {
			if(canghao == 1) {
				price = cost * 0.5;
			}else {
				price = cost * 0.4;
			}
		}
		System.out.println("���Ļ�Ʊ�۸�Ϊ��" + price);
		input.close();
	}

}
