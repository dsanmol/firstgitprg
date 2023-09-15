class metd {
    //Method formation and invocation
    /*
    static int mysum(int a,int b) {              //Method made for simple addition

        int c = a + b;
        return c;

        }
     */
    /*
    public static void main(String[] args) {          //Main Method
        metd s=new metd();           //Method Call using object formation(Method need not to be static )
        int v=s.mysum(3,4);
    
        System.out.println(v);
        
       int w= mysum(2,1);             //Method call without using object (Method need to be static )
       System.out.println(w);
        
    }
    */

    //Using void method
    /* 
    static void favcric(){                                  //void is used when no value is returned from method 
        System.out.println("Tell Me About your fav cricketer");
    }
    public static void main(String[] args) {
        favcric();
    } 
    */
    //Method Over Loading                                       Simple Meaning One Name Two work 
    static void foo(){                                           //with Argument
        System.out.println("Good Morning bro!!!");
    }
    static void foo(int a){                                       //without Argument
        System.out.println("Good Morning"+a+"bro!!!");            
    }
    public static void main(String[] args) {
        foo();
        foo(2000);
    }


}
