package example;

/**
 * @version ɾ������Ԫ��
 * @author ��Զ��
 *
 */
public class deleteArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = -1;
		String[] phones = {"iPhone3 GS����","iPhone4 ����","iPhone4S �仯����","iPhone5 ����"};
		for(int i = 0;i < phones.length;i++) {
			if(phones[i].equals("iPhone3 GS����")) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			for(int i = index;i < phones.length-1;i++) {
				phones[i] = phones[i+1];
			}
			phones[phones.length-1] = null;
		}else {
			System.out.println("û����Ҫɾ�������ݣ�");
		}
		for(int i = 0;i < phones.length;i++) {
			System.out.println(phones[i]);
		}
	}

}
