import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for their name and GPA
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your grade point average: ");
        double gpa = input.nextDouble();

        // Call the method to display the message
        displayCredit(name, gpa);

        input.close();
    }

    // Method to compute and display bookstore credit
    public static void displayCredit(String studentName, double gradePointAverage) {
        double credit = gradePointAverage * 10;
        System.out.printf("%s, with a GPA of %.2f, you have earned a $%.2f bookstore credit.%n",
                          studentName, gradePointAverage, credit);
    }
}
