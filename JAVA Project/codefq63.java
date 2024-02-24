import java.util.Scanner;

class codefq63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        int[] result = new int[t]; // Store results for all test cases

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int k = sc.nextInt();
            int e = Math.abs(a - c) + Math.abs(b - d);
            if (k >= e && (k - e) % 2 == 0) {
                result[i] = 1; // YES
            } else {
                result[i] = 0; // NO
            }
        }

        sc.close();

        // Print results
        for (int i = 0; i < t; i++) {
            if (result[i] == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

