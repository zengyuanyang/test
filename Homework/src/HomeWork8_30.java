/**
 * 8��30��ִ���ࣨ��̬���ӿڣ�
 * @author ��Զ��
 *
 */
public class HomeWork8_30 {

	public static void main(String[] args) {
		Staff s = new Staff();
		s.setName("����");
		s.setStaff_no(123);
		s.setSalary(3200);
		System.out.println(s.getName());
		System.out.println(s.getStaff_no());
		System.out.println(s.getSalary());
		System.out.println("===========================");
		Manager m = new Manager();
		m.setName("����");
		m.setStaff_no(456);
		m.setSalary(5200);
		m.setBonus(1200);
		System.out.println(m.getName());
		System.out.println(m.getStaff_no());
		System.out.println(m.getSalary());
		System.out.println(m.getBonus());
		System.out.println("===========================");
		Staff st = new Manager();	//��̬
		Manager ma = (Manager)st;	//����ת��
		ma.setBonus(2500);
		System.out.println(ma.getBonus());
		System.out.println("===========================");
		Cat8_30 c = new Cat8_30("Tom",23);
		Dog8_30 d = new Dog8_30("����",20);
		c.eat();
		c.jump();
		d.eat();
		d.jump();
		System.out.println("===========================");
		Human h = new Student8_30("����",18);
		h.eat();
		Student8_30 stu = (Student8_30)h;	//����ת��
		stu.smoke();
		System.out.println(h.getName());
		System.out.println(h.getAge());
		h = new Teacher8_30("����",29);
		h.eat();
		Teacher8_30 tea = (Teacher8_30)h;	//����ת��
		tea.smoke();
		System.out.println(h.getName());
		System.out.println(h.getAge());
		System.out.println("===========================");
		
	}

}
