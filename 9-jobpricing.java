import java.util.Scanner;

public class JobPricing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for job details
        System.out.print("Enter the name of the job (e.g., Patel bathroom remodel): ");
        scanner.nextLine(); // Consume newline
        String jobName = scanner.nextLine();

        System.out.print("Enter the cost of materials: $");
        double materialCost = scanner.nextDouble();

        System.out.print("Enter the number of hours of work required: ");
        double workHours = scanner.nextDouble();

        System.out.print("Enter the number of hours of travel time: ");
        double travelHours = scanner.nextDouble();

        // Validate input
        if (materialCost < 0 || workHours < 0 || travelHours < 0) {
            System.out.println("Error: All values must be non-negative.");
            scanner.close();
            return;
        }

        // Calculate the estimated job price
        double estimatedPrice = calculateEstimate(materialCost, workHours, travelHours);

        // Display the estimated price
        System.out.printf("The estimated price for '%s' is: $%.2f\n", jobName, estimatedPrice);

        scanner.close();
    }

    public static double calculateEstimate(double materialCost, double workHours, double travelHours) {
        final double WORK_HOURLY_RATE = 35.0;
        final double TRAVEL_HOURLY_RATE = 12.0;
        return materialCost + (workHours * WORK_HOURLY_RATE) + (travelHours * TRAVEL_HOURLY_RATE);
    }
}
