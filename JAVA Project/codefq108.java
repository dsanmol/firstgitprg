
import java.util.*;

public class codefq108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();
            for (int i = 0; i < n; i++) b[i] = sc.nextLong();
            long mnA = Arrays.stream(a).min().getAsLong();
            long sA = Arrays.stream(a).sum();
            long mnB = Arrays.stream(b).min().getAsLong();
            long sB = Arrays.stream(b).sum();
            long ans = Math.min(mnA * n + sB, mnB * n + sA);
            System.out.println(ans);
        }
        sc.close();
    }
}