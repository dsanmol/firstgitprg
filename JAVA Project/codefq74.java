import java.util.Scanner;

public class codefq74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t<8){
            System.out.println("LESS");
        }
        else if (t==8) {
            System.out.println("PERFECT");
        }
        else {
            System.out.println("MORE");
        }
    }
}
