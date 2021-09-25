import java.util.Scanner;

public class Method3 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score1 = sc.nextInt(); //第一门成绩
		int score2 = sc.nextInt(); //第二门成绩
		/********** Begin **********/
        // 调用方法，传入两门课程的成绩
        calcAvg(score1, score2 );
		/********** End **********/
    }

    /*
     * 功能：计算两门课程考试成绩的平均分并输出平均分
     * 定义一个包含两个参数的方法，用来传入两门课程的成绩
     */

	/********** Begin **********/
    public static void calcAvg(int score1, int score2){
        System.out.println("平均分："+(score1+score2)/2);
    }

	/********** End **********/

}