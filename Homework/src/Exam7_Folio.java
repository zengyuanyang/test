/**
 * 
 * @author ��Զ��
 * @version һ��ֽ�ĺ�ȴ�Լ��0.08mm�����۶��ٴ�֮���ܴﵽ���������ĸ߶ȣ�8848.13�ף�
 */
public class Exam7_Folio {

	public static void main(String[] args) {
		double thickness = 0.00008;
		int count = 0;
		while(thickness < 8848.13){
			count++;
			thickness *= 2;
		}
		System.out.print("����" + count + "�Ρ�");
	}

}
