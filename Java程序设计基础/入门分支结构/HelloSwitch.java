//package step4;

import java.util.Scanner;

public class HelloSwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入月份：");
		
		int input = sc.nextInt();	//鑾峰彇杈撳叆鐨勬湀浠?
		
        //閫氳繃杈撳叆鐨勬湀浠芥潵鍒ゆ柇褰撳墠瀛ｈ妭骞惰緭鍑?
		/*****start*****/
		switch (input){
            case 3:
            case 4:
            case 5:
                System.out.println(input+"月是春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(input+"月是夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(input+"月是秋天");
                break;            
            case 12:
            case 1:
            case 2:
                System.out.println(input+"月是冬天");
                break; 
            default:
                break;
        }
	
		
		/*****end*****/
		
	}
}
