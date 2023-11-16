abstract class pen{
    abstract void write();                                         //Q.1 Make an abstract class pen which has abstract methods write and refill
    abstract void refill();
}

class fountainpen extends pen{
    void write(){
        System.out.println("Writing");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changenib(){
        System.out.println("Change the nib of pen");
    }

}
class Ps_on_abstractmethod {
    public static void main(String[] args) {
        fountainpen obj =new fountainpen();
        obj.changenib();
        obj.write();
        obj.refill();
    }
    
}
