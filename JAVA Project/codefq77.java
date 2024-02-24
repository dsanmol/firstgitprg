import java.util.Scanner;

public class codefq77 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n= sc.nextInt();
            long f= sc.nextLong();
            long a= sc.nextLong();
            long b= sc.nextLong();
            long[] arr=new long[n+1];
            long sum=0;
            for(int i=1;i<=n;i++){
                arr[i]=sc.nextInt();
                sum+=Math.min((arr[i]-arr[i-1])*a,b);
            }
            System.out.println(sum>=f?"NO":"YES");

        }

    }
}
