import java.util.Scanner;

public class codefq58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0){
            String a= sc.next().toLowerCase();
            //char b=a.toCharArray();
            int count1=0;
            int count2=0;
            char[] b=a.toCharArray();
            for(int i=0;i<a.length();i++){
                if(b[i]=='a'){
                    count1++;
                }
                else{
                    count2++;
                }
            }
            if(count1>count2){
                System.out.println("A");
            }
            else{
                System.out.println("B");
            }
            t--;
        }
    }
}
