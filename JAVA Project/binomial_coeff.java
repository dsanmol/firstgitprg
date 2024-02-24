public class binomial_coeff {
    static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }

    public static int bincoeff(int n, int r) {
        int factn = fact(n);
        int factr = fact(r);
        int factnr = fact(n - r);
        return factn / (factr * factnr);
    }

    public static void main(String[] args) {
        System.out.println(bincoeff(5, 2));
    }
}
