package example;
/**
 * @version 插入数据
 * @author 曾远洋
 *
 */
public class addArry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = -1;
		String[] phones = {"iphone4","iphone4s","iphone5",null};
		for(int i = 0;i < phones.length;i++) {
			if(phones[i] == null) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			phones[index] = "iphone5s";
			for(int i = 0;i < phones.length;i++) {
				System.out.println(phones[i]);
			}
		}else {
			System.out.println("数组已满！");
		}
	}

}
