import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for current year and birth year
        System.out.print("Enter the current year: ");
        int currentYear = input.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = input.nextInt();

        // Calculate and display the premium
        int premium = calculatePremium(currentYear, birthYear);
        System.out.println("Your insurance premium is: $" + premium);

        input.close();
    }

    // Method to calculate premium
    public static int calculatePremium(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        int decades = age / 10;
        return (decades + 15) * 20;
    }
}
