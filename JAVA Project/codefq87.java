import java.util.Scanner;

public class codefq87 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            t--;
            int x1= sc.nextInt();
            int y1= sc.nextInt();
            int x2= sc.nextInt();
            int y2= sc.nextInt();
            int x3= sc.nextInt();
            int y3= sc.nextInt();
            int ab,bc,ca;
            ab=Math.abs(x1-x2)+Math.abs(y1-y2)-1+2;
            ca=Math.abs(x1-x3)+Math.abs(y1-y3)-1+2;
            bc=Math.abs(x2-x3)+Math.abs(y2-y3)-1+2;
            if(bc==ab+ca-1){
                System.out.println(1);
            }
            else {
                int s=ab+ca-bc;
                int r=(s-1)/2;
                System.out.println(r+1);
            }
        }
    }
}
