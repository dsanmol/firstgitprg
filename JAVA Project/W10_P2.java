import java.util.Scanner;

public class W10_P2 {
    public static void spiral(int[][] matrix,int di,int di1){
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;
        while(startrow<=endrow&& startcol<=endcol){
            for(int i=startcol;i<=endcol;i++){
                System.out.println(matrix[startrow][i]);
            }
            for (int j=startrow+1;j<=endrow;j++){
                System.out.println(matrix[j][endcol]);
            }
            for (int i=endcol-1;i>=startcol;i--){
                System.out.println(matrix[endrow][i]);
            }
            for(int j=endrow-1;j>=startrow;j--){
                if(startcol==endcol){
                    break;
                }
                System.out.println(matrix[j][startcol]);
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;

        }
    }
    public static void main(String[] args) {
        int i, j;
        // double sum = 0, square = 0, result = 0;
        Scanner s = new Scanner(System.in);
        int dimension = s.nextInt();

        int[][] spiral = new int[dimension][dimension];
        for (i = 0; i < dimension ; i++) {
            // loop for columns
            for (j = 0; j < dimension ; j++) {
                // reads the matrix elements
                spiral[i][j] = s.nextInt();
            }
        }
        spiral(spiral,dimension,dimension);

    }
}
