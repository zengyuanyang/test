/**
 * �����ࣨ�����ࣩ
 * @author ��Զ��
 *
 */
public abstract class Animal8_30 {
	private String name;	//����
	private int age;		//����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Animal8_30() {
	}
	public Animal8_30(String name,int age) {
		this.age = age;
		this.name = name;
	}
	public abstract void eat();		//���󷽷�

}
