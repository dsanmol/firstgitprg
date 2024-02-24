import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class codefq61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int n=input.length();
        HashSet<Character>h=new HashSet<>();
        for(int i=0;i<n;i++){
            if(input.charAt(i)>='a'&&input.charAt(i)<='z'){
                h.add(input.charAt(i));
            }
        }
        System.out.println(h.size());


    }
}

