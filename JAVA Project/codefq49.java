import java.util.Scanner;

public class codefq49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2==0){
                System.out.print("I love\t");
            }
            else{
                System.out.print("I hate\t");
            }
            if(i==a){
                System.out.print("it\t");
            }
            else{
                System.out.print("that\t");
            }
        }
    }
}
