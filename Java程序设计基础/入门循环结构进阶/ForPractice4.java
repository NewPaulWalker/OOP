import java.util.Scanner;

public class ForPractice4 {
    public static void main(String[] args) {
		/*****start*****/
        Scanner input = new Scanner(System.in);

		System.out.println("��ӭʹ���й���������ATMȡ���");
        int balance = 1000;
        int num;
        int select;
        do{
            System.out.println("����ȡ���");
            num = input.nextInt();
            if(balance - num < 0 ){
                System.out.println("Ŀǰ��"+balance+"�޷���������ȡ������");
                continue;
            }else{
                balance -= num;
                System.out.println("ʣ���"+balance+"���Ƿ������'1'��������'2'����������");
                select = input.nextInt();
                if(select==1)
                    break;
            }
        }while(true);
        //�˴���C���Բ�һ�������������ǲ������ͣ�����������
        System.out.println("ȡ�������");
		
		
		
		
		/*****end*****/
	}

}
