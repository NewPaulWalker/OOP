import java.util.Arrays;

public class Method5 {
    public static void main(String[] args) {
     
        int[] scores={79,52,98,81};
		/********** Begin **********/
        //调用方法，传入成绩数组，并获取成绩的个数
        int count= sort(scores);
		/********** End **********/
        System.out.println("共有"+count+"个成绩信息！");
    }

    /*
     * 功能：将考试成绩排序并输出，返回成绩的个数
     * 
     */
	/********** Begin **********/	
    public static int sort(int [] scores){
       // 数组从小到大排序处理
        for(int i=1;i<scores.length;i++){
            if(scores[i] < scores[i-1]){
                int temp = scores[i];
                scores[i] = scores[i-1];
                scores[i-1] = temp;
                if(i>1)
                    i-=2;
            }
        }
       // 打印出数组
        System.out.println(Arrays.toString(scores));
       //返回数组中元素的个数
        return scores.length;
    }
	/********** End **********/
}