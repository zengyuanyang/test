/**
 * 
 * @author ��Զ��
 * @version Square�࣬���ڼ�����ε�������ܳ�
 */
public class Square {
	
	

	private int length;	//��Ա����length
	private int weight;	//��Ա����weight

	public Square() {	//���췽��
		// TODO Auto-generated constructor stub
	}
	
	public int getLength() {		//length��get����
		return length;
	}

	public void setLength(int length) {	//length��set����
		this.length = length;
	}

	public int getWeight() {		//weight��get����
		return weight;
	}

	public void setWeight(int weight) {	//weight��set����
		this.weight = weight;
	}
	
	public int area(int length,int weight) {		//��������ķ���
		return this.getLength()*this.getWeight();	//���ó�Ա�������м���
	}
	public int parimeter(int length,int weight) {	//�����ܳ��ķ���
		return 2*(length + weight);					//���þֲ��������м���
	}

}
