import java.util.Scanner; // Import Scanner class for user input

public class NumbersDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // Prompt user for two integer values
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        // Calling methods for each number
        System.out.println("\nResults for first number (" + num1 + "):");
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        System.out.println("\nResults for second number (" + num2 + "):");
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);

        scanner.close(); // Close the scanner
    }

    // Method to display twice the number
    public static void displayTwiceTheNumber(int num) {
        System.out.println("Twice " + num + " is " + (num * 2));
    }

    // Method to display the number plus five
    public static void displayNumberPlusFive(int num) {
        System.out.println(num + " plus 5 is " + (num + 5));
    }

    // Method to display the number squared
    public static void displayNumberSquared(int num) {
        System.out.println(num + " squared is " + (num * num));
    }
}
