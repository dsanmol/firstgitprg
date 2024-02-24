interface i1{
    int i=10;
    void interface1();

}
class i2 implements i1 {
    public void interface1(){
        System.out.println("hello");
    }
}
public class interfaces {
    public static void main(String[] args) {
        i2 ob=new i2();
        ob.interface1();
    }
}
