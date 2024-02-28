import java.util.Scanner;
import java.lang.Math;

public class codefq92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int res = 0;
            for (int i = 1; i <= n; i++) {
                int x = scanner.nextInt();
                res = gcd(res, Math.abs(x - i));
            }
            System.out.println(res);
        }
        scanner.close();
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
