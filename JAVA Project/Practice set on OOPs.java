import java.util.Scanner;
/* 
class Employee{
    int salary;
    String name;
    public String getname(){
        return name;
    }
    public int getsalary(){
        return salary;
    }
    public void setsalary(int c){
        salary=c;
    }
    public void Chngname(String n){
        name=n;

    }
}
*/
/* 
class Cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");    
    }
    public void callfriend(){
        System.out.println("Calling friend....");
    }
}
*/
class square{
    Scanner z=new Scanner(System.in);
    
    public int ar(){
        
        System.out.println("Enter the Length of side square:");
        int a=z.nextInt();
        
        int f=a*a;
        System.out.println("The area is:"+f);
        return f;
       
        
    }
    public int per(){
       
        System.out.println("Enter the Length of side square:");
        int a=z.nextInt();
        int f=4*a;
        System.out.print("The Perimeter is :"+f);
        return f;
    }

    

    



}
class Oops {
    public static void main(String[] args) {
        //Q.1 Form  a java class employee with methods and properties 
        // Employee anmol=new Employee();
        // anmol.Chngname("Amarjeet");
        // System.out.println(anmol.getname());
        // anmol.setsalary(322);
        // anmol.salary=8000;
        // System.out.println(anmol.getsalary());
        //Q.2 Make ajava class cellphone hving methods like ringing,vibrating etc.        
        // Cellphone mi=new Cellphone();
        // mi.ring();
        // mi.vibrate();
        // mi.callfriend();
        //Q.3 Make a class square which is taking the length of side of a square and calculate area and perimeter   
        // square w=new square();
        // w.ar();
        // w.per();
    }
    
}
