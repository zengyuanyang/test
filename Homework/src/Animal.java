/*
������
��Ա���������֡�����
��Ա��������ʳ�����䡢����
*/
public class Animal {
	static int weight; //����
	static String name; //����
	
	public static int getWeight() {
		return weight;
	}
	public static void setWeight(int weight) {
		Animal.weight = weight;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Animal.name = name;
	}
	public Animal() {
		
	}
	public void foraging() {	//��ʳ����
		System.out.println("��ʳ");
	}
	public void copulation() {	//���䷽��
		System.out.println("����");
	}
	public void multiply() {	//���ܷ���
		System.out.println("����");
	}
}
