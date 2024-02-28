public class pairsinarray {
    public static void pairinarray(int[] ar) {
        int totp = 0;
        for (int i = 0; i < ar.length; i++) {
            int cr = ar[i];
            for (int j = i + 1; j < ar.length; j++) {
                System.out.println("(" + cr + "," + ar[j] + ")");
            }
            totp = ar.length * (ar.length - 1) / 2;

        }
        System.out.println(totp);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        pairinarray(arr);
    }
}
