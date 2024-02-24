import java.util.Scanner;

public class codefq46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        while(n>0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if(a+b>=b+c &&a+b>=a+c){
                System.out.println(a+b);
            }
            else if (b+c>=a+c &&b+c>=a+b) {
                System.out.println(b+c);
            }
            else{
                System.out.println(a+c);
            }
            n--;
        }
    }
}
