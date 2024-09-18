import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
    import java.util.Scanner;

public class TemperatureCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Calculator!");
        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius (0 to 1000): ");
            double celsius = scanner.nextDouble();

            if (celsius < 0 || celsius > 1000) {
                System.out.println("Please enter a value between 0 and 1000.");
            } else {
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);
            }
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit (0 to 1000): ");
            double fahrenheit = scanner.nextDouble();

            if (fahrenheit < 0 || fahrenheit > 1000) {
                System.out.println("Please enter a value between 0 and 1000.");
            } else {
                double celsius = fahrenheitToCelsius(fahrenheit);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheit, celsius);
            }
        } else {
            System.out.println("Invalid choice. Please restart the program.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
System.out.println("Hello world 1");
}
    
}