import java.util.Scanner;
class Libmng{
String[] books;
int noofbooks;
Libmng(){
    this.books=new String[100];
    this.noofbooks=0;
}
void addbook(String book){
    
    this.books[noofbooks] = book;
    noofbooks++;
    System.out.println(book+" Has Been added");

}
void showavailbkk(){
    System.out.println("Availabel Books are:");
    for(String book:this.books){
        if(book==null){
            break;
        }
        System.out.println("*"+book);
    }
}
}
class Main {
    public static void main(String[] args) {
        Libmng l=new Libmng();
        l.addbook("Hello world");
        l.showavailbkk();
        
        
    }
    
}
