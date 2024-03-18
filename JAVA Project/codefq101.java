import java.util.*;

public class codefq101 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tt = scanner.nextInt();
        scanner.nextLine(); // consume newline
        for (int i = 1; i <= tt; i++) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline
        String s = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        while (!s.isEmpty()) {
            int x;
            if (s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'e') {
                x = 2;
            } else {
                x = 3;
            }

            while (x-- > 0) {
                res.append(s.charAt(s.length() - 1));
                s = s.substring(0, s.length() - 1);
            }
            res.append('.');
        }
        res.deleteCharAt(res.length() - 1);
        System.out.println(res.reverse().toString());
    }
}
