public class Method6 {
    public static void main(String[] args) {

		/********** Begin **********/
        // �����޲εķ���
        print();
        // ���ô���һ���ַ��������ķ���	
        print("educoder");
        // ���ô���һ�����Ͳ����ķ���
        print(666);
        /********** End **********/
    }

    /********** Begin **********/
    // �޲�print�����Ķ���
    public static void print(){
        System.out.println("�޲ε�print����");
    }
    
    // �ַ���print�����Ķ���
    public static void print(String s){
        System.out.println("����һ���ַ���������print����������ֵΪ��"+s);
    }
    
    // ����print�����Ķ���
    public static void print(int i){
        System.out.println("����һ�����Ͳ�����print����������ֵΪ��"+i);
    }
	
    /********** End **********/
}