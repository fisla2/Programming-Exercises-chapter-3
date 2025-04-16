import java.util.Scanner;

public class JobPricing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for job info
        System.out.print("Enter the job name: ");
        String jobName = input.nextLine();

        System.out.print("Enter the cost of materials: ");
        double materialCost = input.nextDouble();

        System.out.print("Enter the number of hours of work: ");
        double workHours = input.nextDouble();

        System.out.print("Enter the number of hours of travel time: ");
        double travelHours = input.nextDouble();

        // Calculate the estimate
        double estimate = calculateEstimate(materialCost, workHours, travelHours);

        // Display the results
        System.out.printf("The estimated cost for '%s' is $%.2f%n", jobName, estimate);

        input.close();
    }

    // Method to compute job estimate
    public static double calculateEstimate(double materials, double workHours, double travelHours) {
        return materials + (workHours * 35) + (travelHours * 12);
    }
}
