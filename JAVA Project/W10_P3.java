import java.util.Scanner;
class PrintNumbers implements Runnable{
    private int start;
    private int end;
    PrintNumbers(int start,int end){
        this.start=start;
        this.end=end;
    }

    @Override
    public void run() {
        if(start%2==0 && end%2==0){
            for (int i=start;i<=end;i++){
                if(i%2==0){
                    System.out.print("EvenThread :");
                    System.out.println(i);
                }
            }
        }
        else if (start%2!=0 && end%2!=0) {
            for (int j=start;j<=end;j++){
                if(j%2!=0){
                    System.out.print("OddThread :");
                    System.out.println(j);
                }
            }

        }


    }
}
public class W10_P3{
    //Code to create two threads, one printing even numbers and the other printing odd numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //System.out.print("Enter the starting value for even numbers: ");
        int evenStart = scanner.nextInt();
        // System.out.print("Enter the ending value for even numbers: ");
        int evenEnd = scanner.nextInt();

        // System.out.print("Enter the starting value for odd numbers: ");
        int oddStart = scanner.nextInt();
        // System.out.print("Enter the ending value for odd numbers: ");
        int oddEnd = scanner.nextInt();

        Thread evenThread = new Thread(new PrintNumbers(evenStart, evenEnd), "EvenThread");
        Thread oddThread = new Thread(new PrintNumbers(oddStart, oddEnd), "OddThread");

        evenThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();

        scanner.close();
    }
}
