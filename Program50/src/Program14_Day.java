import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version ����ĳ��ĳ��ĳ�գ��ж���һ������һ��ĵڼ��죿
 */
public class Program14_Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");
		int year = sc.nextInt();
		if(year <= 0) { //�ж����������Ƿ���ȷ
			System.out.println("����ȷ������ݣ�");
			return;
		}
		System.out.println("�������·ݣ�");
		int month = sc.nextInt();
		if(month <= 0 || month > 12) {	//�ж�������·��Ƿ���ȷ
			System.out.println("����ȷ�����·ݣ�");
			return;
		}
		System.out.println("�����������");
		int day = sc.nextInt();
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {	//�ж�����ĺ����Ƿ���ȷ
			if(day < 1 || day > 31) {
				System.out.println("����ȷ���������");
				return;
			}
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day < 1 || day > 30) {
				System.out.println("����ȷ���������");
				return;
			}
			
		}
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			if(month == 2) {
				if(day < 1 || day > 29) {
					System.out.println("����ȷ���������");
					return;
				}
			}
		}else {
			if(month == 2) {
				if(day < 1 || day > 28) {
					System.out.println("����ȷ���������");
					return;
				}
			}
		}
		
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {//�ж�Ϊ����ʱ
			if(month >= 3) {	//�����·ݴ��ڵ���3ʱ��������1
				System.out.println("�����Ǳ���ĵ�" + (sumday(month,day)+1) + "�졣");
			}else {	//�����ǰ������
				System.out.println("�����Ǳ���ĵ�" + sumday(month,day) + "�졣");
			}
			
		}else {//Ϊƽ��ʱ
			System.out.println("�����Ǳ���ĵ�" + sumday(month,day) + "�졣");
		}
		
	}
	public static int sumday(int month,int day) {	//ƽ����������ķ���������ֵΪint���͵�����
		int sum = 0;
		switch(month) {	//����switch
		case 1:
			sum = day;
			break;
		case 2:
			sum = 31 + day;
			break;
		case 3:
			sum = 59 + day;
			break;
		case 4:
			sum = 90 + day;
			break;
		case 5:
			sum = 120 + day;
			break;
		case 6:
			sum = 151 + day;
			break;
		case 7:
			sum = 181 + day;
			break;
		case 8:
			sum = 212 + day;
			break;
		case 9:
			sum = 243 + day;
			break;
		case 10:
			sum = 273 + day;
			break;
		case 11:
			sum = 304 + day;
			break;
		case 12:
			sum = 334 + day;
			break;
		
		}
		return sum;
	}

}
