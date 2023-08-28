import java.math.BigDecimal;
import java.util.Scanner;
class Cbseexamres {
    public static void main(String[] args) {
        System.out.println("Calculating The Percentage based on marks scored");
        Scanner a = new Scanner(System.in);
        System.out.println("Enter Marks Scored in Physics out of 100 :");
        int b = a.nextInt();
        System.out.println("Enter Marks Scored in Chemistry out of 100 :");
        int c = a.nextInt();
        System.out.println("Enter Marks Scored in Maths out of 100");
        int d = a.nextInt();
        System.out.println("Enter Marks Scored in English out of 100");
        int e = a.nextInt();
        System.out.println("Enter Marks Scored in Computer Science out of 100");
        int f = a.nextInt();
        System.out.println("Total Marks Scored is:");
        int sum = b+c+d+e+f;
        System.out.println(sum);
        System.out.println("% Scored By you:");
        float div =  sum/500f;
        float pr = div*100;
        System.out.println(pr +"%");
        System.out.println("Good Luck For Your Future!!!!!");






        
    }
    
}
