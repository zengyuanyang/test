package example;

/**
 * @version 删除数组元素
 * @author 曾远洋
 *
 */
public class deleteArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = -1;
		String[] phones = {"iPhone3 GS经典","iPhone4 革新","iPhone4S 变化不大","iPhone5 掉漆"};
		for(int i = 0;i < phones.length;i++) {
			if(phones[i].equals("iPhone3 GS经典")) {
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
			System.out.println("没有您要删除的内容！");
		}
		for(int i = 0;i < phones.length;i++) {
			System.out.println(phones[i]);
		}
	}

}
