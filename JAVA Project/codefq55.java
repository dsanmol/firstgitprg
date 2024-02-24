import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class codefq55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        String s = scanner.nextLine();

        // Check if the string is a pangram and print the result
        System.out.println(isPangram(n, s) ? "YES" : "NO");

        scanner.close();
    }

    public static boolean isPangram(int n, String s) {
        // Create a set to store unique lowercase characters
        Set<Character> uniqueChars = new HashSet<>();

        // Iterate through the string and add lowercase characters to the set
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                uniqueChars.add(Character.toLowerCase(ch));
            }
        }

        // Check if the number of unique characters is equal to 26 (number of letters in the alphabet)
        return uniqueChars.size() == 26;
    }
}

