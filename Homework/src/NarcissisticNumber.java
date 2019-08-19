public class NarcissisticNumber{
	public static void main(String[] args){
		int gewei,shiwei,baiwei;
		System.out.println("水仙花数有：");
		for(int i = 100;i <= 999;i++){
			gewei = i % 10;
			shiwei = (i/10) % 10;
			baiwei = (i/100) % 10;
			if(gewei*gewei*gewei + shiwei*shiwei*shiwei + baiwei*baiwei*baiwei ==i){
				System.out.println(i);
			}
		}
	}
}