import java.util.Scanner;

public class codefq45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num1.length(); i++) {
            char digit1 = num1.charAt(i);
            char digit2 = num2.charAt(i);
            if (digit1 != digit2) {
                result.append('1');
            } else {
                result.append('0');
            }
        }
        System.out.println(result.toString());
        scanner.close();
    }
}
