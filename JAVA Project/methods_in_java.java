class meth1{
    int method1(){
        int c=8;
        int d=9;
        System.out.println("Method of any custom class invoked by the user");
        return c+d;
    }
}
public class methods_in_java {
    static void firstmethod(){
        System.out.println("hello i am method of java program");
    }
    static int sum(int a,int b){
        int c=a+b;
        System.out.println("This a return type method");
        return c;

    }
    public static void main(String[] args) {
        firstmethod();
        System.out.println(sum(3,4));
        meth1 obj=new meth1();
        System.out.println(obj.method1());
    }
}
