/**
 * 
 * @author 曾远洋
 * @version 输出乘法口诀表
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 9;i++) {	//外层循环，控制行数
			for(int j = 1;j <= i;j++) {	//内层循环，控制列数
				System.out.print(j + "*" + i + "=" + i*j);
				System.out.print('\t');	 //'\t'为转义字符，表格输出
			}
			System.out.print('\n'); //'\n'为转义字符，换行输出
		}
	}

}
