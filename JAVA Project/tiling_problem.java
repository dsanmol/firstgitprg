import java.util.Scanner;

public class tiling_problem {
    public static int tile(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertc=tile(n-1);
        int hori=tile(n-2);

        return vertc+hori;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println(tile(x));
    }
}
