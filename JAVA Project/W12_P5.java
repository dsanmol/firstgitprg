import java.util.Scanner;
interface Vehicle {
    void start();
    void accelerate();
    void brake();
}
class Car implements Vehicle {
    private int door=0;
    Car(int d){
        door=d;
    }

    @Override
    public void start() {
        System.out.println("Car with "+door+" doors started");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating to 60 mph");


    }

    @Override
    public void brake() {
        System.out.println("Applying brakes");

    }
}
class Bike implements Vehicle{
    private int wh=0;
    Bike(int w){
        wh=w;
    }
    @Override
    public void start() {
        System.out.println("Bike with "+wh+" doors started");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating to 40 mph");

    }

    @Override
    public void brake() {
        System.out.println("Applying brakes");
    }
}
public class W12_P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vehicleType = scanner.nextLine();

        // Fixed code: Prefix
        Vehicle vehicle = null;
        switch (vehicleType) {
            case "Car":
                int numDoors = scanner.nextInt();
                vehicle = new Car(numDoors);
                break;
            case "Bike":
                int numWheels = scanner.nextInt();
                vehicle = new Bike(numWheels);
                break;
            default:
                System.out.println("Invalid vehicle type");
                scanner.close();
                System.exit(1);
        }
        if (vehicle != null) {
            vehicle.start();
            vehicle.accelerate();
            vehicle.brake();
        }
        scanner.close();
    }

}
