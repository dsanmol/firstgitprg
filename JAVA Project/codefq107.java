import java.util.Scanner;

public class codefq107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int freq[] = new int[26];
            for (int i = 0; i < n; i++) {
                freq[s.charAt(i) - 'a']++;
            }
            int count = 0;
            for (int it : freq) {
                if (it % 2 != 0) count++;
            }
            if (count - 1 <= k) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
