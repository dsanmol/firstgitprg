import java.util.Arrays;

import java.util.Scanner;

import java.util.stream.IntStream;

public class codefq48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[4];
        for(int i=0;i<4;i++){
            arr[i]= sc.nextInt();
        }
        //Arrays.sort(arr);
        IntStream a= Arrays.stream(arr).distinct();
        int b= (int) a.count();
        System.out.println(4-b);

    }
}
