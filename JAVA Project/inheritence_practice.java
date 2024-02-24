class a{
    static int i;
    static void display(){
        System.out.println(i);
    }
}
class b extends a{
    public static int j;
    static void display(int a){
        System.out.println(a);
    }
}
public class inheritence_practice {
    public static void main(String[] args) {
        a obj=new b();
        b.i=2;
        b.j=5;
        b.display(3);

    }
}
