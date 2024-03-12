public class pallistr {
    public static boolean strp(String a){
        for (int i=0;i<a.length()/2;i++){
            if(a.charAt(i) !=a.charAt(a.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str="hello";
        System.out.println(strp(str));

    }
}
