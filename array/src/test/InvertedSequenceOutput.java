package test;

import java.util.Scanner;

/**
 * @version 第四章练习题1：逆序输出五句话
 * @author 曾远洋
 *
 */
public class InvertedSequenceOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] str = new String[5];
		Scanner input = new Scanner(System.in);
		System.out.println("请输入5句话：");
		for(int i = 0;i < str.length;i++) {
			System.out.println("第" + (i+1) + "句话：");
			str[i] = input.nextLine();
		}
		System.out.println("逆序输出5句话：");
		for(int i = str.length - 1;i >= 0;i--) {
			System.out.printf(str[i]);
		}
		input.close();*/
		/*String[] str = new String[5];
        Scanner sca = new Scanner(System.in);
        str[4] = sca.nextLine();
        str[3] = sca.nextLine();
        str[2] = sca.nextLine();
        str[1] = sca.nextLine();
        str[0] = sca.nextLine();
        for(int i = 0;i<str.length;i++){
            System.out.println(str[i]);
        }*/
		for(int i = 16;i <= 51;i++) {
			System.out.println("#id" + i + "{\r\n" + 
					"	background-color;\r\n" + 
					"}");
		}
	}

}
