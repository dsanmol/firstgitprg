import java.util.Scanner;

public class codefq81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            if(n==2){
                System.out.println(2);
            }
            else {
                System.out.println(n-2);
            }
        }
    }
}
