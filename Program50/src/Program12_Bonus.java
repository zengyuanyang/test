import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version ��ҵ���ŵĽ������������ɡ�����(I)���ڻ����10��Ԫʱ���������10%��
 * �������10��Ԫ������20��Ԫʱ������10��Ԫ�Ĳ��ְ�10%��ɣ�����10��Ԫ�Ĳ��֣��ɿ����7.5%��
 * 20��40��֮��ʱ������20��Ԫ�Ĳ��֣������5%��40��60��֮��ʱ����40��Ԫ�Ĳ��֣������3%��
 * 60��100��֮��ʱ������60��Ԫ�Ĳ��֣������1.5%������100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
 * �Ӽ������뵱������I����Ӧ���Ž���������
 */
public class Program12_Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뱾������");
		long profit = sc.nextLong();
		long bonus = jiangjin(profit);
		System.out.println("����Ӧ������" + bonus + "Ԫ��");
	}
	public static long jiangjin(long profit) {
		long bonus = 0L;
		if(profit >= 0 && profit <= 100000) {	//10������
			bonus = (long) (profit*0.1);
		}else if(profit > 100000 && profit <= 200000) {	//10��20��
			bonus = (long) (100000*0.1 + (profit - 100000)*0.075);
		}else if(profit > 200000 && profit <= 400000) {	//20��40��
			bonus = (long) (100000*0.1 + 100000*0.075 + (profit - 200000)*0.05);
		}else if(profit > 400000 && profit <= 600000) {	//40��60��
			bonus = (long) (100000*0.1 + 100000*0.075 + 200000*0.5 + (profit - 400000)*0.03);
		}else if(profit > 600000 && profit <= 1000000) {	//60��100��
			bonus = (long) (100000*0.1 + 100000*0.075 + 200000*0.05 + 200000*0.03 + (profit -600000)*0.015);
		}else if(profit > 1000000) {	//100������
			bonus = (long) (100000*0.1 + 100000*0.075 + 200000*0.05 + 200000*0.03 + 400000*0.015 + (profit - 1000000)*0.01);
		}
		return bonus;
	}
}
