package console_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelManager travelManager = new TravelManager();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Travel Planner and Expense Estimator ===");
            System.out.println("1. Add Travel Details");
            System.out.println("2. Update Expense Details");
            System.out.println("3. View Travel Summary");
            System.out.println("4. Get Weather Info");
            System.out.println("5. Analyze Budget");
            System.out.println("6. List All Travel Details");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: 
                    System.out.print("Enter your travel destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter trip duration (in days): ");
                    int tripDuration = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter the purpose of the trip: ");
                    String purpose = scanner.nextLine();
                    System.out.print("Enter your total budget: ");
                    double totalBudget = scanner.nextDouble();

                    TravelDetails details = new TravelDetails();
                    details.setTravelDetails(destination, tripDuration, purpose, totalBudget);
                    travelManager.addTravelDetails(destination, details); // Destination is now the key
                    System.out.println("Travel details for " + destination + " added successfully!");
                    break;

                case 2: 
                    travelManager.listAllTravelDetails();
                    System.out.print("Enter the destination of the trip to update expenses: ");
                    String updateDestination = scanner.nextLine();
                    TravelDetails selectedDetails = travelManager.getTravelDetails(updateDestination);
                    if (selectedDetails == null) {
                        System.out.println("No travel details found for the given destination.");
                    } else {
                        System.out.print("Enter transportation cost: ");
                        double transportation = scanner.nextDouble();
                        System.out.print("Enter accommodation cost: ");
                        double accommodation = scanner.nextDouble();
                        System.out.print("Enter meals cost: ");
                        double meals = scanner.nextDouble();
                        System.out.print("Enter activities cost: ");
                        double activities = scanner.nextDouble();

                        ExpenseManager expenseManager = selectedDetails.getExpenseManager();
                        expenseManager.setExpenses(transportation, accommodation, meals, activities);
                        System.out.println("Expenses updated successfully for " + updateDestination + "!");
                    }
                    break;

                case 3: 
                    travelManager.listAllTravelDetails();
                    System.out.print("Enter the destination of the trip to view summary: ");
                    String summaryDestination = scanner.nextLine();
                    TravelDetails summaryDetails = travelManager.getTravelDetails(summaryDestination);
                    if (summaryDetails == null) {
                        System.out.println("No travel details found for the given destination.");
                    } else {
                        TravelSummary.generateSummary(summaryDetails, summaryDetails.getExpenseManager());
                    }
                    break;

                case 4: 
                    travelManager.listAllTravelDetails();
                    System.out.print("Enter the destination of the trip to get weather info: ");
                    String weatherDestination = scanner.nextLine();
                    TravelDetails weatherDetails = travelManager.getTravelDetails(weatherDestination);
                    if (weatherDetails == null) {
                        System.out.println("No travel details found for the given destination.");
                    } else {
                        String weather = WeatherInfo.getWeather(weatherDetails.getDestination());
                        System.out.println("Weather for " + weatherDetails.getDestination() + ": " + weather);
                    }
                    break;

                case 5: 
                    travelManager.listAllTravelDetails();
                    System.out.print("Enter the destination of the trip to analyze budget: ");
                    String budgetDestination = scanner.nextLine();
                    TravelDetails budgetDetails = travelManager.getTravelDetails(budgetDestination);
                    if (budgetDetails == null) {
                        System.out.println("No travel details found for the given destination.");
                    } else {
                        BudgetAnalyzer.analyzeBudget(budgetDetails.getTotalBudget(),
                                budgetDetails.getExpenseManager().getTotalSpent());
                    }
                    break;

                case 6: 
                    travelManager.listAllTravelDetails();
                    break;

                case 7: 
                    System.out.println("Exiting the Travel Planner. Safe travels!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option (1-7).");
            }
        }

        scanner.close();
    }
}
