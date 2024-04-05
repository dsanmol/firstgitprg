import java.util.Scanner;

public class remove_duplicates {
    public static void duplicates(String s,int ind,StringBuilder sb,boolean[] alph){
        if(ind==s.length()){
            System.out.println(sb);
            return;
        }
        char currch=s.charAt(ind);
        if(alph[currch-'a']==true){
            duplicates(s,ind+1,sb,alph);
        }
        else {
            alph[currch-'a']=true;
            duplicates(s,ind+1,sb.append(currch),alph);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        duplicates(a,0,new StringBuilder(""),new boolean[26]);
    }
}
