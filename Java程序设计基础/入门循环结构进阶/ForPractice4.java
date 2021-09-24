import java.util.Scanner;

public class ForPractice4 {
    public static void main(String[] args) {
		/*****start*****/
        Scanner input = new Scanner(System.in);

		System.out.println("欢迎使用中国人民银行ATM取款机");
        int balance = 1000;
        int num;
        int select;
        do{
            System.out.println("输入取款金额：");
            num = input.nextInt();
            if(balance - num < 0 ){
                System.out.println("目前余额："+balance+"无法满足您的取款需求！");
                continue;
            }else{
                balance -= num;
                System.out.println("剩余金额："+balance+"，是否继续（'1'：结束，'2'：继续）：");
                select = input.nextInt();
                if(select==1)
                    break;
            }
        }while(true);
        //此处和C语言不一样，条件必须是布尔类型，不能是整型
        System.out.println("取款结束！");
		
		
		
		
		/*****end*****/
	}

}
