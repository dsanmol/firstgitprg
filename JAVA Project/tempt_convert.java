import java.util.Scanner;
class TemperatureException extends Exception {
    public TemperatureException(String message) {
        super(message);
    }
}

class TemperatureConverter {
    static double celsiusToFahrenheit(double c) throws TemperatureException{
        double ctof=(c*9/5)+32;
        return ctof;

    }
    static double fahrenheitToCelsius(double f){
        double ftoc=(f - 32) * 5 / 9;
        return ftoc;
    }
}

public class tempt_convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            //System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);

            //  System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheitInput = scanner.nextDouble();
            double celsiusOutput = TemperatureConverter.fahrenheitToCelsius(fahrenheitInput);
            System.out.println("Temperature in Celsius: " + celsiusOutput);
        } catch (TemperatureException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
}
