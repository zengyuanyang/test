package example;

import java.util.Scanner;

/**
 * @version ��4�� ����ʾ��
 * @author ��Զ��
 *
 */
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] score = new int[5];
		System.out.println("������5�ųɼ���");
		//forѭ��Ϊ����Ԫ�ظ�ֵ
		for(int i = 0;i < score.length;i++) {
			score[i] = input.nextInt();
		}
		//����forѭ���������Ԫ��
		for(int i = 0;i < score.length;i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		//��ǿforѭ���������Ԫ��
		for(int i : score) {
			System.out.print(i + " ");
		}
		input.close();
	}

}
