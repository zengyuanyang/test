package example;

/**
 * @version �޸���������
 * @author ��Զ��
 *
 */
public class changeArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = -1;
		String[] phones = {"iPhone3 GS����","iPhone4 ����","iPhone4S �仯����","iPhone5"};
		for(int i = 0;i < phones.length;i++) {
			if(phones[i].equals("iPhone5")) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			phones[index] = "iPhone5 ����";
			for(int i = 0;i < phones.length;i++) {
				System.out.println(phones[i]);
			}
		}else {
			System.out.println("������iPhone5");
		}
	}

}
