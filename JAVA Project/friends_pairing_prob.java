import java.util.Scanner;

public class friends_pairing_prob {
    public static int fpair(int n){
        if(n==1 || n==2){
            return n;
        }
        int single=fpair(n-1);
        int pair=fpair(n-2);
        int pairw=n-1*pair;
        int totw=single+pairw;
        return totw;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(fpair(x));

    }
}
