//package step1;
import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
		/*********start*********/
        Scanner input = new Scanner(System.in);

        System.out.println("�������һ������");
        int a = input.nextInt();
        System.out.println("������ڶ�������");
        int b = input.nextInt();

        //�˴������üӺŽ�Ҫ��ӡ����������������ռλ��������Ҳ��Ϊ�ַ�����
        System.out.println("������ӵĽ��Ϊ��"+(a+b));
        System.out.println("��������Ľ��Ϊ��"+(a-b));
        System.out.println("������˵Ľ��Ϊ��"+(a*b));
        System.out.println("��������Ľ��Ϊ��"+(a/b));
        //ȡģ�������������ǰһ�����������йأ����ܺ�����
        System.out.println("����ȡ�����Ľ��Ϊ��"+(a%b));
		/*********end*********/
	}

}
