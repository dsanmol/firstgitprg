import java.util.Scanner;

public class codefq50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % b == 0) {
                System.out.println(0);
            } else if (a < b) {
                System.out.println(b - a);
            } else {
                System.out.println(b - a % b);

            }
            t--;

        }
    }
}
