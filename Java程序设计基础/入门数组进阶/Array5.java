import java.util.Arrays;
import java.util.Scanner;

public class Array5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��̬��������
		int[] arr = new int[sc.nextInt()];
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		/********** Begin **********/
        for(int j=arr.length -1;j>0;j--){
            for(int i=0;i < j;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
		
        System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		/********** End **********/
	}
}	
