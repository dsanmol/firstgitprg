import java.util.Scanner;

public class codefq51 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int w1= sc.nextInt();
            int w2= sc.nextInt();
            int x1= sc.nextInt();
            int x2= sc.nextInt();
            int m= sc.nextInt();
            if(w2-w1<x1*m){
                System.out.println(0);
            }
            else if (w2-w1>x2*m) {
                System.out.println(0);
            }
            else {
                System.out.println(1);
            }
            t--;
        }

    }
}
