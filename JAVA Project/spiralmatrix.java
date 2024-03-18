public class spiralmatrix {
    public static void spiral(int[][] matrix){
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
        int[][] matrix={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        spiral(matrix);

    }
}
