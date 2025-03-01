import java.util.Scanner; // Import Scanner class for user input

public class Percentages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Prompt user for two double values
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Call computePercent() method with original order
        computePercent(num1, num2);

        // Call computePercent() method with reversed order
        computePercent(num2, num1);

        scanner.close(); // Close the scanner
    }

    // Method to compute and display percentage
    public static void computePercent(double a, double b) {
        double percentage = (a / b) * 100; // Calculate percentage
        System.out.printf("%.2f is %.2f percent of %.2f%n", a, percentage, b);
    }
}
