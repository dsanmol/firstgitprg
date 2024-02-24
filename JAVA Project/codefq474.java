import java.util.Scanner;

public class codefq474 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == b) {
                System.out.println(0);
            } else {
                System.out.println(a % b);
            }
            t--;
        }
    }
}
