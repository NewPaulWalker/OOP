//package step5;

import java.util.Scanner;

public class Practice {
    
    	final static Scanner sc = new Scanner(System.in);	//����ɨ����

		//��һ��
		public void first(){
			System.out.println("������������");
            int input = sc.nextInt();		//��ȡ���������
            
			/*****start*****/
			
			if (input<10){
				System.out.println("��볡");
			}else{
				System.out.println("��ȫ��");
			}
			
			
			
			/*****end*****/
		}
		
		//�ڶ���
		public void second(){
			System.out.println("������������ڼ���");
            int input = sc.nextInt();		//��ȡ���������
            
			/*****start*****/
			if(input==1){
				System.out.println("������׷�");
			}else if(input == 2){
				System.out.println("�����ţ��");
			}else if(input==3){
				System.out.println("����Լ���");
			}else{
				System.out.println("����Ժ�����");
			}
			

			
			/*****end*****/
		}	
		
		//������
		public void third(){
			System.out.println("������������ڼ���");
            int input = sc.nextInt();		//��ȡ���������
            
			/*****start*****/
			switch (input){
				case 1:
					System.out.println("������׷�");
					break;
				case 2:
					System.out.println("�����ţ��");
					break;
				case 3:
					System.out.println("����Լ���");
					break;
				default:
					System.out.println("����Ժ�����");
					break;
			}
			
			
			
			/*****end*****/
		}
}
