package console_project;

public class TravelSummary {
    public static void generateSummary(TravelDetails travelDetails, ExpenseManager expenseManager) {
        double totalBudget = travelDetails.getTotalBudget();
        double totalSpent = expenseManager.getTotalSpent();
        double savings = totalBudget - totalSpent;

        System.out.println("\n=== Travel Summary ===");
        System.out.println("Destination: " + travelDetails.getDestination());
        System.out.println("Trip Duration: " + travelDetails.getTripDuration() + " days");
        System.out.println("Purpose: " + travelDetails.getPurpose());

        System.out.println("\nBudget Overview:");
        System.out.printf("  - Total Budget: %.2f%n", totalBudget);
        System.out.printf("  - Total Spent: %.2f%n", totalSpent);
        System.out.printf("  - Savings: %.2f%n", savings);

        System.out.println("\nCategory-Wise Comparison:");
        System.out.printf("  - Transportation: %.2f%n", expenseManager.getTransportationCost());
        System.out.printf("  - Accommodation: %.2f%n", expenseManager.getAccommodationCost());
        System.out.printf("  - Meals: %.2f%n", expenseManager.getMealsCost());
        System.out.printf("  - Activities: %.2f%n", expenseManager.getActivitiesCost());

        System.out.println("\nHighlights:");
        System.out.println("Plan your trip wisely and enjoy!");
    }
}
