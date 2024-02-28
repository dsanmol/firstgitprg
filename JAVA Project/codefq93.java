import java.util.Scanner;

public class codefq93 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            t--;
            int n= sc.nextInt();
            int k= sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= sc.nextInt();
                System.out.println(arr[i]);
                arr[i]--;
                System.out.println(arr[i]);
            }
//            int bd=0;
//            for(int j=0;j<n;j++){
//                if(arr[j]%k!=j%k){
//                    bd++;
//                }
//            }
//            if(bd==0){
//                System.out.println(0);
//            }
//            else if (bd==2) {
//                System.out.println(1);
//
//            }
//            else {
//                System.out.println(-1);
//            }
        }
    }
}
