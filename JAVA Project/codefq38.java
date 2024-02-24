import java.util.Scanner;



public class codefq38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a,b=0,c=0;
        for(int i=0;i<n;i++){
            a=scanner.nextInt();
            if(a!=b){
                c++;
            }
            b=a;
        }
        System.out.println(c);
    }
}
