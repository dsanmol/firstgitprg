public class star_pattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        //inverse star pattern
        for(int a=5;a>=1;a--){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int z=1;z<5;z++){
            System.out.println("*"+"*"+"*"+"*"+"*");
        }
        for(int t=0;t<=5;t++){
            for(int y=0;y<=t;y++){
                System.out.print(y);
            }
            System.out.println(" ");
        }
        char ch='a';
        for(int f=1;f<=5;f++){
            for(int x=1;x<f;x++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}
