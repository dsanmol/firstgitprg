import java.util.Scanner;

public class codefq76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int maxScore = Integer.MIN_VALUE;
            int manOfTheMatch = -1;

            for (int i = 1; i <= 22; i++) {
                int runs = scanner.nextInt();
                int wickets = scanner.nextInt();

                int score = runs * 1 + wickets * 20;

                if (score > maxScore) {
                    maxScore = score;
                    manOfTheMatch = i;
                }
            }

            System.out.println(manOfTheMatch);
        }

        scanner.close();
    }
}

