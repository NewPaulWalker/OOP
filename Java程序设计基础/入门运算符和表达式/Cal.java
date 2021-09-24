//package step1;
import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		/*********start*********/
        Scanner input = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int a = input.nextInt();
        System.out.println("请输入第二个整数");
        int b = input.nextInt();

        //此处可以用加号将要打印的连接起来，不用占位符，将其也视为字符串？
        System.out.println("两数相加的结果为："+(a+b));
        System.out.println("两数相减的结果为："+(a-b));
        System.out.println("两数相乘的结果为："+(a*b));
        System.out.println("两数相除的结果为："+(a/b));
        //取模运算的正负号与前一个数的正负有关，不管后面数
        System.out.println("两数取余数的结果为："+(a%b));
		/*********end*********/
	}

}
