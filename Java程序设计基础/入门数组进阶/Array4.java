import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//动态创建数组
		int[] arr = new int[sc.nextInt()];
		for(int i = 0 ; i< arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		/********** Begin **********/
		for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		/********** End **********/
	}
}
