//package step4;

import java.util.Scanner;

public class HelloSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������·ݣ�");
		
		int input = sc.nextInt();	//获取输入的月�?
		
        //通过输入的月份来判断当前季节并输�?
		/*****start*****/
		switch (input){
            case 3:
            case 4:
            case 5:
                System.out.println(input+"���Ǵ���");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(input+"��������");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(input+"��������");
                break;            
            case 12:
            case 1:
            case 2:
                System.out.println(input+"���Ƕ���");
                break; 
            default:
                break;
        }
	
		
		/*****end*****/
		
	}
}
