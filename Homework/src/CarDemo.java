/*
����
��Ա��������С��Ʒ�ơ���ɫ
��Ա������������ֹͣ
*/
class Car{
	private int size;	//��С
	private String brand;	//Ʒ��
	private String color; //��ɫ
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Car() {
		
		// TODO Auto-generated constructor stub
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void start() {	//��������
		System.out.println("����");
	}
	
	public void stop() {	//ֹͣ����
		System.out.println("ֹͣ");
	}
}

class CarDemo{
	public static void main(String[] args) {
		Car ca = new Car();
		String color = "��ɫ";
		ca.setColor(color);
		System.out.println(ca.getColor());
	}
}
