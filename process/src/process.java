import java.util.Scanner;

/**
 * @version ���̿���
 * @author ��Զ��
 *
 */
public class process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifѡ��ṹ
		System.out.println("������ɼ���");
		Scanner input = new Scanner(System.in);
		/*int grade = input.nextInt();
		if(grade >= 60) {
			System.out.println("�ɼ��ϸ�ͨ�����ԡ�");
		}else {
			System.out.println("�ɼ����ϸ񡣿���δͨ����");
		}
		//���֧if���
		if(grade >= 90 && grade <=100) {
			System.out.println("A��");
		}else if(grade >= 80) {
			System.out.println("B��");
		}else if(grade >= 70) {
			System.out.println("C��");
		}else if(grade >= 60) {
			System.out.println("D��");
		}else {
			System.out.println("E��");
		}
		//switch���
		switch(grade/10) {
		case 10:
		case 9:
			System.out.println("A��");
			break;
		case 8:
			System.out.println("B��");
			break;
		case 7:
			System.out.println("C��");
			break;
		case 6:
			System.out.println("D��");
			break;
		default:
			System.out.println("E��");
		}
		//Ƕ��if�������
		System.out.println("������������ڼ���");
		int day = input.nextInt();
		System.out.println("�������������£�");
		double temp = input.nextDouble();
		String weather = "������";
		if(day == 6 || day == 7) {
			if(temp > 30) {
				System.out.println("ȥ��Ӿ");
			}else {
				System.out.println("ȥ��ɽ");
			}
		}else {
			if(weather.equals("������")) {
				System.out.println("ȥ�ͻ���λ̸ҵ��");
			}else {
				System.out.println("�ڹ�˾����������");
			}
		}*/
		//whileѭ��
		int i=1;
		int sum=0;
		while(i <= 100) {
			sum = sum + i; //sum += i
			i++;
		}
		System.out.println("��Ϊ��" + sum);
		//do-while
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("��Ϊ��" + sum);
		//forѭ��   ����ѭ��
		/*String end = null;
		do {                  //���ڳ���ʼ���о�ֱ��ִ����һ�Σ�����ѡ��do-while
		String name;
		int score;
		int zongfen = 0;
		double avg;
		System.out.print("����ѧ��������");
		name = input.next();
		for(int j = 1;j <= 5;j++) {
			System.out.print("������5�Ź����е�" + j + "�ſεĳɼ���");
			score = input.nextInt();
			zongfen += score;
		}
		avg = zongfen/5;
		System.out.println(name + "��ƽ�����ǣ�" + avg);
		System.out.println("����������y/n����");
		end = input.next();
		}while(end.equals("y") || end.equals("Y"));
		System.out.println("�ɼ�¼�����");*/
		//��ת���1
		for(int k = 1;k <= 10;k++) {
			if(k % 4 == 0) {
				break;
			}
			System.out.print(k + " ");
		}
		System.out.println("ѭ��������");
		//��ת���2
		String str = "";
		while(true) {
			System.out.println("�������ַ�����");
			str = input.next();
			System.out.println("��������ַ����ǣ�" + str);
			if(str.equals("bye")) {
				break;
			}
		}
		System.out.println("���������");
	}

}
