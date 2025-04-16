import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for room dimensions
        System.out.print("Enter the length of the room in feet: ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the room in feet: ");
        double width = input.nextDouble();

        System.out.print("Enter the height of the room in feet: ");
        double height = input.nextDouble();

        // Calculate and display final price
        double totalPrice = calculatePaintCost(length, width, height);
        System.out.printf("The total cost to paint the room is $%.2f%n", totalPrice);

        input.close();
    }

    // Calculates wall area and total cost
    public static double calculatePaintCost(double length, double width, double height) {
        double wallArea = 2 * (length + width) * height;
        double gallonsNeeded = calculateGallons(wallArea);
        System.out.printf("Total wall area is %.2f square feet.%n", wallArea);
        System.out.printf("You will need %.2f gallons of paint.%n", gallonsNeeded);

        double pricePerGallon = 32.0;
        double totalPrice = gallonsNeeded * pricePerGallon;
        return totalPrice;
    }

    // Calculates gallons of paint needed based on wall area
    public static double calculateGallons(double area) {
        return area / 350.0;
    }
}
