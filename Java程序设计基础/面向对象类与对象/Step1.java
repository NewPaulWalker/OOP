package step1;

public class Test {
	public static void main(String[] args) {
		/********** Begin **********/
		//����Dog����
        Dog wuhuarou = new Dog();
		//����Dog���������
		wuhuarou.name = "�廨��";
        wuhuarou.color = "��ɫ";
        wuhuarou.variety = "����˹��";
		
		//���С��������
		System.out.println("���֣�" +  wuhuarou.name   + "��ëɫ��" + wuhuarou.color   + "��Ʒ�֣�" + wuhuarou.variety );
		
		//���÷���
        wuhuarou.eat();
		wuhuarou.run();
		/********** End **********/
		
	}
}

//�����ﶨ��Dog��
/********** Begin **********/
class Dog{
    String name;
    String color;
    String variety;

    void eat(){
        System.out.println("�й�ͷ");
    }
    void run(){
        System.out.println("���Ź�ͷ��");
    }
}


/********** End **********/