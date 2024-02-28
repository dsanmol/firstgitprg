import java.util.Scanner;

public class codefq91 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int[] arr=new int[n];
            int sum=0;int flag=0;
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
                sum+=arr[i];
                if(arr[i]%3==1)
                    flag=1;

            }
            if(sum%3==0)
                System.out.println("0");
            if(sum%3==1&flag==0)
                System.out.println("2");
            if(sum%3==1&&flag==1)
                System.out.println("1");
            if(sum%3==2)
                System.out.println("1");
        }
    }
}
