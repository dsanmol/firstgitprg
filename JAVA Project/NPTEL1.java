import java.util.Scanner;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}
class FlyingFish implements Flyable,Swimmable{
    private String b;
    FlyingFish(String a){
        this.b=a;
    }

    @Override
    public void fly() {
        System.out.println(b+" can glide through the air");
    }

    @Override
    public void swim() {
        System.out.println(b+" can swim in water");

    }
}
public class NPTEL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the name of the fish: ");
        String fishName = scanner.nextLine();

        FlyingFish flyingFish = new FlyingFish(fishName);

        // Test the FlyingFish class
        flyingFish.fly();
        flyingFish.swim();

        scanner.close();
    }
}
