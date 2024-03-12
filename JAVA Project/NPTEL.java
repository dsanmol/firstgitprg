import java.util.Scanner;

interface Shape {
    double calculateArea();
}
class Circle implements Shape{
    private double radius;
    Circle(Double rad){
        this.radius=rad;
    }

    @Override
    public double calculateArea() {
        Double c=Math.PI*radius*radius;
        return c;
    }
}
class Rectangle implements Shape{
    private double length;
    private double width;
    Rectangle(Double l,Double b){
        this.length=l;
        this.width=b;
    }

    @Override
    public double calculateArea() {
        Double d=length*width;
        return d;
    }
}
public class NPTEL{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test the Circle class
        // System.out.print("Enter the radius of the circle: ");
        double circleRadius = scanner.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.println("Circle Area: " + circle.calculateArea());

        // Test the Rectangle class
        // System.out.print("Enter the length of the rectangle: ");
        double rectangleLength = scanner.nextDouble();
        // System.out.print("Enter the width of the rectangle: ");
        double rectangleWidth = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
        System.out.print("Rectangle Area: " + rectangle.calculateArea());

        scanner.close();
    }
}