import java.util.Scanner;

public class codefq86 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            t--;
            int n= sc.nextInt();
            int m= sc.nextInt();
            int k= sc.nextInt();
            int x= sc.nextInt();
            int y= sc.nextInt();
            String ans = "YES";
            for(int i=0;i<k;i++){
                int x1= sc.nextInt();
                int y1= sc.nextInt();
                if ((x+y)%2==(x1+y1)%2) {
                    ans="NO";
                }

            }
            System.out.println(ans);
        }
    }
}
