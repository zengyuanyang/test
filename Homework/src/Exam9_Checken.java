/**
 * 
 * @author ��Զ��
 * @version 5��Ǯ������һֻ������3��Ǯ������һֻĸ����1��Ǯ������3ֻ������
 * 	������100��Ǯ��100ֻ������ô���й�����ĸ������������ֻ��
 */
public class Exam9_Checken {

	public static void main(String[] args) {
		int gj,mj,cj;
		for(gj = 0;gj <= 20;gj++) {
			for(mj = 0;mj <= 33;mj++) {
				for(cj = 0;cj <= 100;cj++) {
					if(gj*5 + mj*3 + cj*1 == 100 && gj+mj+cj*3 == 100) {
						System.out.println("������" + gj + "ֻ��ĸ����" + mj + "ֻ��������" + cj*3 + "ֻ��");
					}
				}
			}
		}
	}

}