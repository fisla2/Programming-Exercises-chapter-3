import java.util.Scanner;

public class BookBilling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for user input
        System.out.print("Enter the number of books ordered: ");
        int quantity = input.nextInt();

        System.out.print("Enter the coupon value (enter 0 if none): ");
        double coupon = input.nextDouble();

        // Call all three versions
        double total1 = computeBill();
        double total2 = computeBill(quantity);
        double total3 = computeBill(quantity, coupon);

        // Display results
        System.out.printf("\nTotal using no parameters (1 book): $%.2f%n", total1);
        System.out.printf("Total using quantity only (%d books): $%.2f%n", quantity, total2);
        System.out.printf("Total using quantity and coupon: $%.2f%n", total3);

        input.close();
    }

    // Constants
    public static final double BOOK_PRICE = 14.99;
    public static final double TAX_RATE = 0.08;

    // Version 1: No parameters
    public static double computeBill() {
        double subtotal = BOOK_PRICE;
        double tax = subtotal * TAX_RATE;
        return subtotal + tax;
    }

    // Version 2: Quantity only
    public static double computeBill(int quantity) {
        double subtotal = quantity * BOOK_PRICE;
        double tax = subtotal * TAX_RATE;
        return subtotal + tax;
    }

    // Version 3: Quantity + coupon
    public static double computeBill(int quantity, double coupon) {
        double subtotal = (quantity * BOOK_PRICE) - coupon;
        if (subtotal < 0) subtotal = 0; // Prevent negative subtotal
        double tax = subtotal * TAX_RATE;
        return subtotal + tax;
    }
}
