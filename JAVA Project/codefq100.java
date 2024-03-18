import java.util.Scanner;

public class codefq100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] cnt = new int[26];
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 26; j++) {
                if (cnt[j] == a[i]) {
                    cnt[j]++;
                    s.append((char) (97 + j));
                    break;
                }
            }
        }
        System.out.println(s.toString());
    }
}
