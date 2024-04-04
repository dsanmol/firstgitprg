import java.util.Scanner;

public class printno {
    public static void fun(int x){
        if(x==1){
            System.out.println(1);
            return;
        }
        fun(x-1);     //to print number in increasing order
        System.out.println(x+" ");
        //fun(x-1);      //to print number in decreasing order
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        fun(n);
    }
}
