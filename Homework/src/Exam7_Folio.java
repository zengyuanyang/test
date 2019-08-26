/**
 * 
 * @author 曾远洋
 * @version 一张纸的厚度大约是0.08mm，对折多少次之后能达到珠穆朗玛峰的高度（8848.13米）
 */
public class Exam7_Folio {

	public static void main(String[] args) {
		double thickness = 0.00008;
		int count = 0;
		while(thickness < 8848.13){
			count++;
			thickness *= 2;
		}
		System.out.print("对折" + count + "次。");
	}

}
