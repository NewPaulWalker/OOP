import java.util.Arrays;

public class Method5 {
    public static void main(String[] args) {
     
        int[] scores={79,52,98,81};
		/********** Begin **********/
        //���÷���������ɼ����飬����ȡ�ɼ��ĸ���
        int count= sort(scores);
		/********** End **********/
        System.out.println("����"+count+"���ɼ���Ϣ��");
    }

    /*
     * ���ܣ������Գɼ�������������سɼ��ĸ���
     * 
     */
	/********** Begin **********/	
    public static int sort(int [] scores){
       // �����С����������
        for(int i=1;i<scores.length;i++){
            if(scores[i] < scores[i-1]){
                int temp = scores[i];
                scores[i] = scores[i-1];
                scores[i-1] = temp;
                if(i>1)
                    i-=2;
            }
        }
       // ��ӡ������
        System.out.println(Arrays.toString(scores));
       //����������Ԫ�صĸ���
        return scores.length;
    }
	/********** End **********/
}