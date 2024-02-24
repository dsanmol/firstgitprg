import java.util.Arrays;
import java.util.Scanner;

public class codefq44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
        double[] arr=new double[(int) n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextDouble();
        }
        double sum=Arrays.stream(arr).sum();
        double avg=sum/n;
        System.out.println(avg);
    }
}
