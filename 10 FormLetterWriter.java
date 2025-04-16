import java.util.Scanner;

public class FormLetterWriter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for first and last name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.println("\nCalling method with first name only:");
        displaySalutation(firstName); // First version

        System.out.println("\nCalling method with first and last name:");
        displaySalutation(firstName, lastName); // Overloaded version

        input.close();
    }

    // First overloaded method: accepts first name only
    public static void displaySalutation(String firstName) {
        System.out.println("Dear " + firstName + ",");
        System.out.println("Thank you for your recent order.");
    }

    // Second overloaded method: accepts first and last name
    public static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName + ",");
        System.out.println("Thank you for your recent order.");
    }
}
