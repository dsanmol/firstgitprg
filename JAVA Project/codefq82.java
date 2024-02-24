import java.util.Scanner;

public class codefq82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n % 2 == 0 || n % 2 == x % 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
