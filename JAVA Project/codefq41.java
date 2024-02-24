import java.util.Scanner;
import java.util.*;
public class codefq41 {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0){
            t--;

            int a= sc.nextInt();
            int b=sc.nextInt();
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            sc.nextLine();
            if(a==a1&&b==b1 ||a==b1 &&b==a1){
                System.out.println(1);
            }
            else if (a==a2&&b==b2 ||a==b2 &&b==a2){
                System.out.println(2);
            }
            else {
                System.out.println(0);
            }



        }
    }
}
