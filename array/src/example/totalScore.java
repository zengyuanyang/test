package example;
/**
 * @version ��ά��������ܳɼ�
 * @author ��Զ��
 *
 */
public class totalScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arry = new int[][] {{80,66},{70,54,98},{77,59}};
		for(int i = 0;i < arry.length;i++) {
			int sum = 0;
			for(int j = 0;j < arry[i].length;j++) {
				sum += arry[i][j];
			}
			String banji = (i+1) + "���ܳɼ�:";
			System.out.println(banji + sum);
		}
	}

}
