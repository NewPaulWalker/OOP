//package step4;

import java.util.Scanner;

public class TestYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean result;
        /********start********/
        
        result=  (year%400 == 0) || (year%4==0 && year%100!=0)     ? true : false;
        
        System.out.println(year + "年是否为闰年:" + result);
        
        /********end********/
	}

}
