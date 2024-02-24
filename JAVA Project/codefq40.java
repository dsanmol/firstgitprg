import java.util.Scanner;

public class codefq40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            t--;
            int a= sc.nextInt();
            if(a>=1 &&a<100){
                System.out.println("Easy");
            }
            else if (a>=100 &&a<200) {
                System.out.println("Medium");

            }
            else if (a>=200 && a<=300) {
                System.out.println("Hard");

            }
        }
    }
}
