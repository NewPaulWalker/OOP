package chapter2.step7;
/********* Begin *********/
import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args){
		
        Scanner input = new Scanner(System.in);

        System.out.println("请录入嫦娥个人信息：");

        System.out.println("请输入姓名：");
        String name = input.next();

        System.out.println("请输入年龄：");
        int age = input.nextInt();

        System.out.println("请输入性别：");
        /*
        *Scanner不能获取char字符类型，但可以用String来代替
        */
        String sex = input.next();

        System.out.println("请输入体重：");
        double weight = input.nextDouble();

        System.out.println("请输入地址：");
        String addr = input.next();

        System.out.println("请输入是否已婚：");
        String married = input.next();

        System.out.println("信息如下：");
        //在不使用占位符时，只能将其分开输出
        System.out.println("\t姓名："+name);
        System.out.print("\t年龄：");
        System.out.print(age);
        System.out.println("岁");
        System.out.println("\t性别："+sex);
        System.out.print("\t体重：");
        System.out.print(weight);
        System.out.println("kg");
        System.out.println("\t地址："+addr);
        System.out.println("\t婚否："+married);




		/********* End *********/
	}
}