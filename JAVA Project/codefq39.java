import java.util.Scanner;

public class codefq39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n+1];
        for(int i=1;i<n+1;i++){
            arr[sc.nextInt()-1]=i;
        }
        for(int j=0;j<n;j++){
            System.out.println(arr[j]+" ");
        }
    }
}
