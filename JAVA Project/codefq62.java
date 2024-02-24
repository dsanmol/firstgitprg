import java.util.Scanner;

public class codefq62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            int a= sc.nextInt();
            int b= sc.nextInt();
            if(a==b)
                System.out.println("1");
            else {
                System.out.println((b-a)*2+1);
            }
            t--;
        }
    }
}
