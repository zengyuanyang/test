/**
 * 
 * @author ��Զ��
 * @version ����10000Ԫ�������У���������ǧ��֮����ÿ��1�꣬���������Ϣ�����Ϊ�µı��𡣼���5��󣬻�õı����Ƕ���
 */
public class Exam3_Principle {

	public static void main(String[] args) {
		double pri = 10000;
		double rate = 0.003;
		for(int i = 1;i <= 5;i++) {
			pri = pri + pri*rate;
		}
		System.out.println("�����ı���Ϊ" + pri);
	}

}
