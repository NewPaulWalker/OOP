import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[sc.nextInt()];
		
		//ѭ�������鸳ֵ
		for(int i = 0 ; i< scores.length;i++){
			scores[i] = sc.nextInt();
		}
		/********** Begin **********/
		//�������������scores��ƽ��ֵ�����ֵ
		double sum = 0;
        int max = scores[0];
        for(int i = 0;i<scores.length;i++){
            sum += scores[i];

            if(max < scores[i])
                max = scores[i];
        }
		
		
		
		
		
		
		System.out.println("ƽ��ֵ��"  + (sum/scores.length));
		System.out.println("���ֵ��"  + max);
		/********** End **********/
	}
}
