import java.util.Scanner;

public class codefq56 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            double u= sc.nextInt();
            double maxv= sc.nextInt();
            double a= sc.nextInt();
            double s= sc.nextInt();
            double e=0;
            e=Math.sqrt(u*u-2*(a*s));
            if(e>maxv){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;

        }
    }
}
