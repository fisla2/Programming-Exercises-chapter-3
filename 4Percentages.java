import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for two double values
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Call computePercent() with original order
        computePercent(num1, num2);

        // Call computePercent() with reverse order
        computePercent(num2, num1);

        input.close();
    }

    // Method to compute and display percentage
    public static void computePercent(double a, double b) {
        double percent = (a / b) * 100;
        System.out.printf("%.2f is %.2f percent of %.2f%n", a, percent, b);
    }
}
