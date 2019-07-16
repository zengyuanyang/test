package example;

/**
 * @version 修改数组数据
 * @author 曾远洋
 *
 */
public class changeArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = -1;
		String[] phones = {"iPhone3 GS经典","iPhone4 革新","iPhone4S 变化不大","iPhone5"};
		for(int i = 0;i < phones.length;i++) {
			if(phones[i].equals("iPhone5")) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			phones[index] = "iPhone5 掉漆";
			for(int i = 0;i < phones.length;i++) {
				System.out.println(phones[i]);
			}
		}else {
			System.out.println("不存在iPhone5");
		}
	}

}
