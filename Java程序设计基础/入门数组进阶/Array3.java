import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		/********** Begin **********/
		//将a的值赋给b   b的值赋给a
		int temp;
        temp = a;
        a = b;
        b =temp;
		
		
		
		

		/********** End **********/
		System.out.println(a);
		System.out.println(b);
	}
	
}
