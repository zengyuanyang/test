
/** 
 * 
 * @author 曾远洋
 * @version 使用方法，实现输入三个数，返回最大值
 */
class Max {

	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.show();
	}
}
class Outer{
	public int num = 10;
	class Inner{
		public int num = 20;
		public void show() {
			int num = 30;
			System.out.println(num);
			System.out.println(this.num);
			System.out.println(Outer.this.num);
		}
	}
}
