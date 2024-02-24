import java.util.Scanner;

public class codefq57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            long n=sc.nextInt();
            long sum=(n*(n+1))/2;
            if(sum%2==0){
                System.out.println(n);
            }
            else{
                System.out.println(n-1);
            }
            t--;
        }
    }
}
