import java.util.Scanner;

public class Method4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();   //��ȡ��һ�����������
        int j = sc.nextInt();	//��ȡ�ڶ������������
		
		/********** Begin **********/
		//��������÷�����ȡ����ֵ
        int max = getMax(i, j);
        System.out.println( i+"��"+j+"�Ƚϣ����ֵ�ǣ�"  +max    );
		/********** End **********/
    }

	/*�����ﴴ��getMax������������������Ϊ�������������������нϴ��ֵ*/
    
	/********** Begin **********/
	public static int getMax(int a, int b){
        if(a>b)
            return a;
        return b;
    }

    /********** End **********/
}