
public class Array4 {
    public static void main(String[] args) {
		/********** Begin **********/
		int[][] scores = {
            {92,85},
            {91,65},
            {90,33}
        };
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                System.out.println(scores[i][j]);
            }
        }
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                scores[i][j] = j+1;
            }
        }
        for(int i=0;i<scores.length;i++){
            for(int j=0;j<scores[i].length;j++){
                System.out.println(scores[i][j]);
            }
        }
		
		
		
		
		
		
		
		
		/********** End **********/
	}

}
