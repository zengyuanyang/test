/**
 * ���࣬�̳��붯����
 * @author ��Զ��
 *
 */
public class Dog extends AnimalDoor{

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String name,int age,String color) {
		super(name,age,color);
	}
	public void lookDoor() {
		System.out.println("��ϲ�����ţ�");
	}
	public void eat() {
		super.eat();
		System.out.println("��ϲ���Թ�ͷ��");
	}

}
