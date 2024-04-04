import java.util.Scanner;

public class sum_of_natural_num {
    public static int sumofntr(int n){
        if(n==1){
            //System.out.println(1);
            return 1;
        }
        return n+sumofntr(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(sumofntr(x));

    }
}
