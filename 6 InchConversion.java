import java.util.Scanner;

public class InchConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to enter a value in inches
        System.out.print("Enter a value in inches: ");
        int inches = input.nextInt();

        // Call methods to convert and display
        convertToFeet(inches);
        convertToYards(inches);

        input.close();
    }

    // Method to convert inches to feet
    public static void convertToFeet(int inches) {
        double feet = inches / 12.0;
        System.out.printf("%d inches is equal to %.2f feet.%n", inches, feet);
    }

    // Method to convert inches to yards
    public static void convertToYards(int inches) {
        double yards = inches / 36.0;
        System.out.printf("%d inches is equal to %.2f yards.%n", inches, yards);
    }
}
