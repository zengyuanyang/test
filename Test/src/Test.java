
class Test {

	public static void main(String[] args) {
		//����ת��
			Fu f = new Zi();
			System.out.println(f.age);
			f.show();
			f.tst();
			
//			f.play;   //����
			//����ת��
			System.out.println("===================================================");
			System.out.println(((Zi)f).age);
			System.out.println(((Zi)f).length);
			System.out.println(((Zi)f).size);
			((Zi)f).show();
			((Zi)f).tst();
			((Zi)f).play();
			
			
	}

}
class Fu{
	int age = 30;
	int length = 18;
	Fu(){
		System.out.println("�����췽��");
	}
	public void show() {
		System.out.println("����Ա����");
	}
	public static void tst() {
		System.out.println("����̬����");
	}
}

class Zi extends Fu{
	int age = 10;
	int size = 3;
	Zi(){
		System.out.println("�ӹ��췽��");
	}
	public void show() {
		System.out.println("�ӳ�Ա����");
	}
	public void play() {
		System.out.println("������Ϸ");
	}
	public static void tst() {
		System.out.println("�Ӿ�̬����");
	}
}
