import java.util.Scanner;
public class m{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int max = (int)(Math.random()*100+1);
       int min = max;
       for(int i = 0;i < 100;i++) {
    	   int m = (int)(Math.random()*100+1);
    	   if(m > max) {
    		   max = m;
    	   }
    	   if(m < min) {
    		   min = m;
    	   }
       }
       System.out.println("max=" + max + ",min=" + min);
    }
    
}