import java.util.Scanner;

public class PaintCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for room dimensions
        System.out.print("Enter the length of the room (feet): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room (feet): ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the room (feet): ");
        double height = scanner.nextDouble();

        // Calculate the wall area
        double wallArea = calculateWallArea(length, width, height);

        // Calculate the number of gallons needed
        double gallonsNeeded = calculateGallonsNeeded(wallArea);

        // Calculate the total price
        double totalPrice = calculatePrice(gallonsNeeded);

        // Display results
        System.out.printf("Gallons of paint needed: %.2f\n", gallonsNeeded);
        System.out.printf("Total cost: $%.2f\n", totalPrice);

        scanner.close();
    }

    public static double calculateWallArea(double length, double width, double height) {
        // Wall area = 2 * (length * height) + 2 * (width * height)
        return 2 * (length * height) + 2 * (width * height);
    }

    public static double calculateGallonsNeeded(double wallArea) {
        final double COVERAGE_PER_GALLON = 350.0;
        return wallArea / COVERAGE_PER_GALLON;
    }

    public static double calculatePrice(double gallonsNeeded) {
        final double PRICE_PER_GALLON = 32.0;
        return gallonsNeeded * PRICE_PER_GALLON;
    }
}
