/**
 * ѧ����
 * @author ��Զ��
 *
 */
public class Student8_30 extends Human implements Smoke {

	public Student8_30() {	//�޲ι��췽��
		super();	//�����޲ι��췽��
	}
	public Student8_30(String name,int age) {	//�вι��췽��
		super(name,age);		//�����вι��췽��
	}
	public void eat() {	//��д�����е�eat����
		System.out.println("ѧ���Զ�����");
	}
	public void smoke() {	//��д�ӿ��е�smoke����
		System.out.println("����ͬѧ���̣�");
	}

}
