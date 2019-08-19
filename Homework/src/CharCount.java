import java.util.Scanner;
public class CharCount{
	public static void main(String[] args){
		int letter = 0;
		int space = 0;
		int number = 0;
		int other = 0;
		int i = 0;
		char c;
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sca.nextLine();
		while(i <= str.length()-1){
			c = str.charAt(i);
			if((c >= 65 && c <= 90)||(c >= 97 && c <= 122)){
				letter++;
			}else if(c == 32){
				space++;
			}else if(c >= 48 && c <= 57){
				number++;
			}else{
				other++;
			}
			i++;
		}
		System.out.println("该字符串中英文字母个数为：" + letter + ",空格个数为：" + space + ",数字个数为：" + number + ",其他字符个数为：" + other);
	}
}