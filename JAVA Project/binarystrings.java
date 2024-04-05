import java.util.Scanner;

public class binarystrings {
    public static void binstr(int n,int lp,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binstr(n-1,0,str+"0");
        if(lp==0){
            binstr(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        binstr(n,0,"");
    }
}
