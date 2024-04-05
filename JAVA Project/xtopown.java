import java.util.Scanner;

public class xtopown {
    public static int power(int n,int p){
        if(p==0){
            return 1;
        }
        return n*power(n,p-1);
    }
    public static int power1(int n,int p){                   //time complex is O(logn)
        if(p==0){
            return 1;
        }
        int pow=power1(n,p/2);
        int pow1=pow*pow;

        if(n%2!=0){
            pow1=n*pow;
        }
        return pow1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        int p= sc.nextInt();
        System.out.println(power(x,p));
    }
}
