/*
 �����⣺
	������д���:���ж���û�����⣬���û�У�д�����
	
	��̬�ĳ�Ա�����ص㣺
		���������뿴��ߣ����п��ұߡ�
		
	�̳е�ʱ��
		�������к͸�����һ���ķ���������д��
		������û�и����г��ֹ��ķ����������ͱ��̳й����ˡ�
	
	
*/
class A {
	public void show() {
		
		System.out.println("A show");
		show2();
	}
	
	public void show2() {
		System.out.println("��");
	}
	
}
class B extends A {
	
	public void show() {
		//����
		System.out.println("B show");
		show2(); //����show2()��������˭�ڵ��� ��B�ڵ��û���C�ڵ���
		//���ʹ�ö�̬���������ڸ��෽�����ٴ�ִ��һ�����������뻹�ǿ���ߣ�
		//ֻ�������ڵ�����Ǹø���ĸ�����Ȼ�����У�˭���ÿ�˭
	}
	
	
	public void show2() {
		System.out.println("��");
	}
	
}
class C extends B {
	public void show() {
		super.show(); //����  ���ø����show()
	}
	public void show2() {
		System.out.println("��");
	}
}
//��ȥдִ�й���

public class DuoTaiTest4 {
	public static void main(String[] args) {
		A a = new B(); //��̬������
		a.show(); 
		/*
		���ȴ���A���͵�B�������ִ��A�е�Ĭ�Ϲ��췽������ִ��B�е�Ĭ�Ϲ��췽����
		Ȼ����A���Ƿ���show�������ҵ������A�е�show������ִ��B�е�show���������B show������ִ��B�е�show2������� ��
		*/
		B b = new C(); //��̬������  C����  ȷ��B��û��show���������е�ʱ������C
		b.show(); 
		/*
		���ȴ���B���͵�C�������ִ��B�е�Ĭ�Ϲ��췽������ִ��C�е�Ĭ�Ϲ��췽����
		Ȼ�����B�е�show��ִ��C�е�show������super.show()Ϊ����B�е�show���������B show��������ִ��show2������������C�������õ�����
		ִ��C�е�show2��������������㡣
		*/
		//�����ʱ���뿴B��show�治���ڣ����п�C��show,���ʸ����show����
		//�ڶ�̬���÷�����ʱ�򣬾Ϳ������ߵĸ�����û�и÷������б���ͬû�б���
	}
}