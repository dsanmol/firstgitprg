class base1{
    base1(){
        System.out.println("Constructor of base class");
    }
    base1(int x){
        //super(7);
        System.out.println("Constructor of base class with arguments"+ x);
    }

    
    
}
class derived1 extends base1{
    derived1(){
        System.out.println("Constructor of derived class");
    }
    derived1(int x,int y){
        super(x);
        System.out.println("Constructor of derived class with arguments"+ y);
    }
}
class inheritanceconstructor {
    public static void main(String[] args) {
        derived1 d=new derived1(12,9);
        
    }
    
}
