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
		System.out.println("������һ���ַ�����");
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
		System.out.println("���ַ�����Ӣ����ĸ����Ϊ��" + letter + ",�ո����Ϊ��" + space + ",���ָ���Ϊ��" + number + ",�����ַ�����Ϊ��" + other);
	}
}