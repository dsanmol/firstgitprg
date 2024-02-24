import java.util.Scanner;

public class codefq79 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            t--;
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            int min=Math.min(a,b);
            int min1=Math.min(min,c);
            int d=(a/min1+b/min1+c/min1)-3;
            if(a%min1==0&&b%min1==0&c%min1==0){
                if(d<=3){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("NO");
            }

        }
    }
}
