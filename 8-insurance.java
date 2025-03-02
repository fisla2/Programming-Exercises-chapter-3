import java.util.Scanner;

public class Insurance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        // Validate input
        if (birthYear > currentYear || birthYear <= 0) {
            System.out.println("Error: Birth year must be a valid positive number and less than or equal to the current year.");
            scanner.close();
            return;
        }

        // Calculate the insurance premium
        int premium = calculatePremium(currentYear, birthYear);

        // Display the premium amount
        System.out.println("Your insurance premium is: $" + premium);

        scanner.close();
    }

    public static int calculatePremium(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        int decades = age / 10;
        return (decades + 15) * 20;
    }
}
