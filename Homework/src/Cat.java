/**
 * è�࣬�̳��붯����
 * @author ��Զ��
 *
 */
public class Cat extends AnimalDoor{

	public Cat() {	//�޲ι��췽��
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name,int age,String color) {	//�вι��췽��
		super(name,age,color);	//���ø�����вι��췽��
	}
	public void play() {	
		System.out.println("èϲ���棡");
	}
	public void eat() {
		super.eat();
		System.out.println("èϲ�����㣡");
	}

}
