import java.util.Vector;
import java.util.Scanner;


public class codefq85 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n= sc.nextInt();


            Vector<Integer> a = new Vector<>();
            for (int i = 0; i < n; i++){
                a.add(sc.nextInt());
            }

            long sum_a = 0, cnt_1 = 0;
            for (int x: a) {
                sum_a += x;
                if (x == 1) cnt_1++;
            }

            if (sum_a >= cnt_1 + n && n > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
