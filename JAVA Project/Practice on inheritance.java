// class circle{
//     public int radius;
//     circle(int r){
//         this.radius=r;
        

//     }
//     double area(){
//         return Math.PI*this.radius*this.radius;
//     }
    
// }
// // class cyclinder extends circle{
//     public int height;
//     cyclinder(int r,int h){
//         super(r);
//         this.height=h;

//     }
//     double volume(){
//         return Math.PI*this.radius*this.radius*this.height;
//     }

// }

class rectangle{
    // public int length ;
    // public int width;
    // rectangle(int l,int w){
    //     this.length=l;
    //     this.width=w;

    // }
    int length;
    int width;
    void set(int len,int wid){
        this.length=len;
        this.width=wid;
        System.out.println("Getter for taking length and width");
    }
    double get(){
        return length*width ;
    }
    // double ar(){
    //     return this.length*this.width;
    // }

}

class cuboid extends rectangle {
    
    int high;
    
    cuboid(int l,int w,int hi){
        super(l,w);
        this.high=hi;
    }
    double vol(){
        return this.length*this.width*this.high;
    }

}

class ps_on_inheri {
    public static void main(String[] args) {
        //Q.1 Create a class circle use inheritance to create another class cyclinder from it
        // cyclinder obj=new cyclinder(2,4);
        // System.out.println(obj.volume());
        // System.out.println(obj.area());
        //Q.2 Create a replication of ques1 with rectangle and cuboid
        rectangle obj1=new rectangle();
        obj1.set(20,30);
        System.out.println(obj1.get());
        //System.out.println(obj1.vol());
        //System.out.println(obj1.ar());
        
        
    }
    
}
