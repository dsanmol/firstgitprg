import java.util.*;
import java.util.function.IntPredicate;

public class codefq75 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }


            int x=Arrays.stream(arr).min().getAsInt();
            if(x<=4){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }


        }
    }
}
