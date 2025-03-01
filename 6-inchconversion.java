import java.util.Scanner; // Import Scanner for user input

public class InchConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // Prompt user for the number of inches
        System.out.print("Enter a value in inches: ");
        while (!scanner.hasNextDouble()) { // Validate input
            System.out.println("Invalid input. Please enter a numeric value.");
            scanner.next(); // Discard invalid input
        }
        double inches = scanner.nextDouble();

        // Call methods to convert inches to feet and yards
        convertToFeet(inches);
        convertToYards(inches);

        scanner.close(); // Close the scanner
    }

    // Method to convert inches to feet
    public static void convertToFeet(double inches) {
        double feet = inches / 12; // 12 inches = 1 foot
        System.out.printf("%.2f inches is equal to %.2f feet.%n", inches, feet);
    }

    // Method to convert inches to yards
    public static void convertToYards(double inches) {
        double yards = inches / (12 * 3); // 36 inches = 1 yard
        System.out.printf("%.2f inches is equal to %.2f yards.%n", inches, yards);
    }
}
