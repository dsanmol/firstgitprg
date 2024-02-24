import java.util.*;

public class codefq53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] passed = new boolean[n];

        int p = scanner.nextInt();
        for (int i = 0; i < p; i++) {
            int level = scanner.nextInt();
            passed[level - 1] = true;
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            int level = scanner.nextInt();
            passed[level - 1] = true;
        }

        boolean canPassAllLevels = true;
        for (boolean levelPassed : passed) {
            if (!levelPassed) {
                canPassAllLevels = false;
                break;
            }
        }

        if (canPassAllLevels) {
            System.out.println("I become the guy.");
        } else {
            System.out.println("Oh, my keyboard!");
        }
    }
}

