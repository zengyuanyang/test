/**
 * 
 * @author 曾远洋
 * @version Square类，用于计算矩形的面积和周长
 */
public class Square {
	
	

	private int length;	//成员变量length
	private int weight;	//成员变量weight

	public Square() {	//构造方法
		// TODO Auto-generated constructor stub
	}
	
	public int getLength() {		//length的get方法
		return length;
	}

	public void setLength(int length) {	//length的set方法
		this.length = length;
	}

	public int getWeight() {		//weight的get方法
		return weight;
	}

	public void setWeight(int weight) {	//weight的set方法
		this.weight = weight;
	}
	
	public int area(int length,int weight) {		//计算面积的方法
		return this.getLength()*this.getWeight();	//利用成员变量进行计算
	}
	public int parimeter(int length,int weight) {	//计算周长的方法
		return 2*(length + weight);					//利用局部变量进行计算
	}

}
