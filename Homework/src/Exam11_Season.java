import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version �����·ݣ������Ӧ�ļ��ڣ�������������������ü��ڵĳ���ͻ��
 * 
 */
public class Exam11_Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���·ݣ���1����12��");
		int season = sc.nextInt();
		if(season < 1 || season > 12) {
			System.out.println("�·��������");
			return;
		}else if(season >= 3 && season <= 5){
			System.out.println("����");
			System.out.println("�ݳ�ݺ��");
			System.out.println("���֣�");
		}else if(season >= 6 && season <= 8){
			System.out.println("����");
			System.out.println("��������");
			System.out.println("������");
		}else if(season >= 9 && season <= 11){
			System.out.println("����");
			System.out.println("�����ˬ");
			System.out.println("�ջ�");
		}else {
			System.out.println("����");
			System.out.println("ѩ�ϼ�˪");
			System.out.println("���ߣ�");
		}
	}

}
