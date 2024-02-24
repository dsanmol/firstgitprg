import java.util.Scanner;

public class codefq83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++){
            int x = sc.nextInt();
            int h = sc.nextInt();
            int d = x / 2;
            int count = 0;
            int j=0;
            while(h>0 && j<5){
                h = h - d;
                count = count + 1;
                j = j + 1;
            }
            while(h>0){
                h = h - x;
                count = count + 1;
            }
            System.out.println(count);
        }
        }
    }
