package step2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String sex = sc.next();
		/********** Begin **********/
		//�ֱ�ʹ�����ֹ�����������Person����  
		Person p1 = new Person();
        Person p2 = new Person(name, sex);

		/********** End **********/
		
	}
}

//����Person���󣬲��������ֹ��췽��
/********** Begin **********/
class Person{
    Person(){
        System.out.println("һ���˱�������");
    }
    Person(String name, String sex){
        System.out.println("������"+name+"���Ա�"+sex+"����������");
    }
}


/********** End **********/
