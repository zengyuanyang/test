/**
 * è�ࣨ�����ࣩ���̳��붯����
 * @author ��Զ��
 *
 */
public class Cat8_30 extends Animal8_30 implements Jump{
		
	public Cat8_30() {	//�޲ι��췽��
		super();		//�����޲ι��췽��
	}
	public Cat8_30(String name,int age) {	//�вι��췽��
		super(name,age);		//�����вι��췽��
	}
	public void eat() {	//��дeat����
		System.out.println("è���㣡");
	}
	public void jump() {		//��д�ӿ��еķ���
		System.out.println("è����");
	}
}
