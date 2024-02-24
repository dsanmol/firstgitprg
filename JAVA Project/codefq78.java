import java.util.Scanner;

public class codefq78 {
     static int remi(int n){
        if(n%2==0){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            t--;
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if(remi(a)==remi(b)&&remi(a)==remi(c)){
                System.out.println("1 1 1");
            }
            else if (remi(a)==remi(b)){
                System.out.println("0 0 1");
            }
            else if (remi(b)==remi(c)){
                System.out.println("1 0 0");
            }
            else if (remi(a)==remi(c)){
                System.out.println("0 1 0");
            }

        }
    }
}
