//package step3;
import java.util.Scanner;



public class testLogic {
	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
  		boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        boolean c=sc.nextBoolean();
        
		/*********start  *********/
        System.out.println(!a);
        System.out.println(a&&b);
        System.out.println(b||c);
        System.out.println(a^b);
		/*********end  *********/
	}

}
