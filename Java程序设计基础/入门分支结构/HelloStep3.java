//package step3;

import java.util.Scanner;

public class HelloStep3 {
	public static void main(String[] args) {
		System.out.println("星级成绩评定系统");
		System.out.println("请输入成绩：");
		Scanner sc = new Scanner(System.in);
		/******start******/
        int score = sc.nextInt();
        if(score >= 90){
            System.out.println("*****五星成绩");
        }else if(score >= 80){
            System.out.println("****四星成绩");
        }else if(score >= 70){
            System.out.println("***三星成绩");
        }else if(score >= 60){
            System.out.println("**俩星成绩");
        }else{
            System.out.println("无星成绩");
        }
		
		
		
		
		
		
		/******end******/
	}
}
