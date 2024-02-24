import java.util.Scanner;

class codefq52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        while(t-- > 0){
            double s = sc.nextDouble(); // Initial stock price
            double a = sc.nextDouble(); // Lower limit
            double b = sc.nextDouble(); // Upper limit
            double c = sc.nextDouble(); // Percentage change

            // Calculate the new price
            double newPrice = s + (s * c) / 100;

            // Check if the new price is within the range [A, B]
            if(newPrice >= a && newPrice <= b){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
