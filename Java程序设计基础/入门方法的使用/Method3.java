import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score1 = sc.nextInt(); //��һ�ųɼ�
		int score2 = sc.nextInt(); //�ڶ��ųɼ�
		/********** Begin **********/
        // ���÷������������ſγ̵ĳɼ�
        calcAvg(score1, score2 );
		/********** End **********/
    }

    /*
     * ���ܣ��������ſγ̿��Գɼ���ƽ���ֲ����ƽ����
     * ����һ���������������ķ����������������ſγ̵ĳɼ�
     */

	/********** Begin **********/
    public static void calcAvg(int score1, int score2){
        System.out.println("ƽ���֣�"+(score1+score2)/2);
    }

	/********** End **********/

}