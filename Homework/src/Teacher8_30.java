/**
 * ��ʦ��
 * @author ��Զ��
 *
 */
public class Teacher8_30 extends Human implements Smoke {

	public Teacher8_30() {	//�޲ι��췽��
		super();		//�����޲ι��췽��
	}
	public Teacher8_30(String name,int age) {	//�вι��췽��
		super(name,age);		//�����вι��췽��
	}
	public void eat() {	//��д�����е�eat����
		System.out.println("��ʦ�Զ�����");
	}
	public void smoke() {	//��д�ӿ��е�smoke����
		System.out.println("������ʦ���̣�");
	}
}
