public class shrtdist {
    public static double shtpath(String p){
        int x=0;
        int y=0;
        for (int i=0;i<p.length();i++){
            char d=p.charAt(i);
            if (d == 'S') {
                y--;
            }
            if (d=='N'){
                y++;
            }
            if (d == 'W') {
                x--;
            }
            if(d=='E'){
                x++;
            }
        }
        double d=Math.sqrt(x*x+y*y);
        return d;
    }
    public static void main(String[] args) {
        String pa="WNEENESENNN";
        System.out.println(shtpath(pa));

    }
}
