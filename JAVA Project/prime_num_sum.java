import java.util.Scanner;

public class prime_num_sum {
    public static int primeSum(int a,int b){
        int sum=0;
        for (int i =a; i <= b; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
        // System.out.println("The sum of prime numbers in the given range is: " + sum);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(primeSum(x, y));
    }
}
