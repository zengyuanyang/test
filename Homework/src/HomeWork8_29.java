/**
 * 8��29����ҵ��ִ����
 * @author ��Զ��
 *
 */
public class HomeWork8_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.eat();
		new Teacher().eat();	//�����������Teacher��ĳ�Ա����
		Cat cat = new Cat();
		cat.play();
		cat.eat();
		//ͨ������setXXX��������ֵ
		cat.setName("Tom");
		cat.setAge(2);
		cat.setColor("��ɫ");
		System.out.println("è��������" + cat.getName() + ",è��������" + cat.getAge() + ",è����ɫ��" + cat.getColor());
		//ͨ���вη������ó�Ա������ֵ
		Cat cat2 = new Cat("�ӷ�è",5,"��ɫ");
		System.out.println("è��������" + cat2.getName() + ",è��������" + cat2.getAge() + ",è����ɫ��" + cat2.getColor());
		System.out.println("==============================================================");
		Dog dog = new Dog();
		dog.lookDoor();
		dog.eat();
		//ͨ������setXXX��������ֵ
		dog.setName("��ʿ��");
		dog.setAge(3);
		dog.setColor("�ڰ�ɫ");
		System.out.println("����������" + dog.getName() + ",����������" + dog.getAge() + ",������ɫ��" + dog.getColor());
		//ͨ���вη������ó�Ա������ֵ
		Dog dog2 = new Dog("����˹��",3,"�ڰ�ɫ");
		System.out.println("����������" + dog2.getName() + ",����������" + dog2.getAge() + ",������ɫ��" + dog2.getColor());
		
	}

}
