import java.util.Scanner;
abstract class Shape {
    protected abstract void calcArea();
    public abstract void printArea();
}
class Circle extends Shape{
    private double rad;
    private String shapeType;
    private double area;
    Circle(String type,double r){
        shapeType=type;
        rad=r;

    }

    @Override
    protected void calcArea() {
        area=Math.PI*rad*rad;

    }

    @Override
    public void printArea() {
        System.out.println("Area of Circle: "+area);
    }
}
class Rectangle extends Shape{
    private double len;
    private double width;
    private String shapeType;
    private double area;
    Rectangle(String type,double l,double b){
        shapeType=type;
        len=l;
        width=b;

    }

    @Override
    protected void calcArea() {
        area=len*width;

    }

    @Override
    public void printArea() {
        System.out.println("Area of Rectangle :"+area);
    }
}
class Square extends Shape{
    private double side;
    private String shapeType;
    private double area;
    Square(String type,double s){
        shapeType=type;
        side=s;
    }

    @Override
    protected void calcArea() {
        area=side*side;

    }

    @Override
    public void printArea() {
        System.out.println("Area of Square: "+area);
    }
}
public class W12_P4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter shape type (Circle, Rectangle or Square): ");
        String shapeType = scanner.nextLine();
        // System.out.print("Enter first dimension: ");
        double arg1 = scanner.nextDouble();
        Shape shape = null;
        if (shapeType.equalsIgnoreCase("Circle")) {
            shape = new Circle(shapeType, arg1);
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            double arg2 = scanner.nextDouble();
            shape = new Rectangle(shapeType, arg1, arg2);
        } else if (shapeType.equalsIgnoreCase("Square")) {
            shape = new Square(shapeType, arg1);
        } else {
            System.out.println("Invalid shape type");
            scanner.close();
            return;
        }
        shape.calcArea();
        shape.printArea();
        scanner.close();
    }
}
