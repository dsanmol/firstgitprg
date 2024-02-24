public class advanced_patterns {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){                       //-->to print a hollow rectangle
            for(int j=1;j<=5;j++){
                if(i==1 ||i==4 ||j==1||j==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        for(int a=1;a<=4;a++){
            for (int c=1;c<=4-a;c++){           //-->for inverted and rotated star pattern
                System.out.print(" ");

            }
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int n=1;n<=5;n++){
            for(int y=1;y<=5-n+1;y++){
                System.out.print(y);
            }
            System.out.println(" ");
        }
    }
}
