package console_project;

public class BudgetAnalyzer {
    public static void analyzeBudget(double totalBudget, double totalSpent) {
        System.out.println("\n=== Budget Analysis ===");
        if (totalSpent > totalBudget) {
            double overspent = totalSpent - totalBudget;
            System.out.printf("Warning: You have overspent by %.2f! Consider cutting back on expenses.\n", overspent);
        } else if (totalSpent < totalBudget) {
            double savings = totalBudget - totalSpent;
            System.out.printf("Great job! You saved %.2f from your budget.\n", savings);
        } else {
            System.out.println("You have perfectly utilized your budget. Well done!");
        }
    }
}
