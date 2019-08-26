/*
车类
成员变量：大小、品牌、颜色
成员方法：启动、停止
*/
class Car{
	private int size;	//大小
	private String brand;	//品牌
	private String color; //颜色
	
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

	public void start() {	//启动方法
		System.out.println("启动");
	}
	
	public void stop() {	//停止方法
		System.out.println("停止");
	}
}

class CarDemo{
	public static void main(String[] args) {
		Car ca = new Car();
		String color = "红色";
		ca.setColor(color);
		System.out.println(ca.getColor());
	}
}
