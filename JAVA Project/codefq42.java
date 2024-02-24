import java.util.Arrays;
import java.util.Scanner;

public class codefq42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        while (t-- > 0) {
            int n = scanner.nextInt(); // Length of the array
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a); // Sort the array in ascending order

            // Calculate the maximum beauty
            int maxBeauty = 0;
            for (int i = 1; i < n; i++) {
                maxBeauty += Math.abs(a[i] - a[i - 1]);
            }
            System.out.println(maxBeauty);
        }
        scanner.close();
    }
}


