import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//strΪҪ���ҵ��ַ���
		String str = sc.next();
		
		/********** Begin **********/
		//��������   arr  �����鸳ֵ {"����","������","���޼�","��������","�Ÿ���"}
		String[] arr = new String[]{"����","������","���޼�","��������","�Ÿ���"};
		
		for(int i=0;i<arr.length;i++){
            //��equals�����Ƚ������ַ����Ƿ����
            if(str.equals(arr[i])){
                System.out.println(str+"������ĵ�"+(i+1)+"��λ��");
                break;
            }
        }

		
		
		
		/********** End **********/
	}
}
