class base{                                                //Parent class or super class
    int x;
    void setX(int x){
        this.x=x;
        
    }
    int getX(){
        return x;
    }
}
class derived extends base{
     int y;
    void setY(int y){
        this.y=y;
        
    }
    int getY(){
        return y;
    }

}

class Inheritance {
    public static void main(String[] args) {
        base b=new base();
        b.setX(19);
        System.out.println(b.getX());
        derived d=new derived();
        d.setX(10);
        System.out.format("Getting using derived class(inheritance method) %d",d.getX());
        
    }
    
}
