import java.util.Scanner;

public class factusingrecur {
    public static int fact(int x){
        if(x==1){
            //System.out.println(1);
            return 1;
        }

        return x*fact(x-1);
        //System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(fact(n));
    }
}
