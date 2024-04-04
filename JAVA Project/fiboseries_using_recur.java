import java.util.Scanner;

public class fiboseries_using_recur {
    public static int fibo(int x){
        if(x==0){
            return 0;
        }
        else if (x==1) {
            return 1;
        }
        else {
            return fibo(x-1)+fibo(x-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fibo(n));
        for(int i=0;i<n;i++){
            System.out.println(fibo(i));
        }
    }
}
