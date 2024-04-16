import java.util.Scanner;

public class prgassingn {
    public static void validatePassword(String password) {
        // Rule 1: Check the length of the password
        if (password.length() < 8) {
            System.out.println("Your password is invalid.\n" +"The password must be at least 8 characters long.");
            return; // Exit the method if the rule is not met
        }

        // Rule 2: Check for uppercase letters
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Your password is invalid.\n" +
                    "The password must contain at least one uppercase letter (A-Z).");
            return; // Exit the method if the rule is not met
        }

        // Rule 3: Check for lowercase letters
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Your password is invalid.\n" +"The password must contain at least one lowercase letter (a-z).");
            return; // Exit the method if the rule is not met
        }

        // Rule 4: Check for digits
        if (!password.matches(".*[0-9].*")) {
            System.out.println("Your password is invalid.\n" +"The password must contain at least one digit (0-9).");
            return; // Exit the method if the rule is not met
        }

        // If all rules are met
        System.out.println("Your password is valid.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        validatePassword(password);
    }
}
