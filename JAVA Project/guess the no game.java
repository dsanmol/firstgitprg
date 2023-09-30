import java.util.Random;
import java.util.Scanner;
class game{
    int number;
    int n;
    int noofguesses=0;

    int getnoofguesses(){
        return noofguesses;
    }
    public void setnoofguesses(int noofguesses){
        noofguesses=noofguesses;

    }

    game(){
        Random rand=new Random();
        number= rand.nextInt(100);

    }
    void takeuserinput(){
        System.out.println("Enter the Number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
    }
    boolean Iscorrect(){
        noofguesses++;
        if(n==number){
            System.out.format("You Guessed it correct the correct number is %d \n You guessed it in %d attempts ",number,noofguesses);
            return true;

        }
        else if(number>n){
            System.out.println("Entered Number is to low...");

        }
        else if(number<n){
            System.out.println("Entered Number is to high...");

        }
        return false;
    }


    
    

    
}




class Main {
    public static void main(String[] args) {
        game g=new game();
        boolean b= false;
        while(!b){
             g.takeuserinput();
             b=g.Iscorrect();
             
        

        }
       
    }
    
}
