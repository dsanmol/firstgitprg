import java.util.*;
public class codefq54 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=0;
        int min=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[max]<arr[i])max=i;
            if(arr[min]>=arr[i])min=i;
        }
        int ans=0;
        if(max>min) ans--;
        ans+=max+n-min-1;
        System.out.println(ans);
        sc.close();
    }
}


