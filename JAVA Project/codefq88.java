import java.util.Scanner;
import java.util.Vector;

import java.util.*;

public class codefq88 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = sc.nextInt();
        }

        long sum = 0;
        for (int i = 0; i < n; ++i) {
            sum += a[i];
        }
        int element = (int) (sum / n);
        long extra = 0;

        for (int i = 0; i < n; ++i) {
            if (a[i] >= element) {
                extra += (a[i] - element);
            } else {
                long need = element - a[i];
                if (extra >= need) {
                    extra -= need;
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }
}

