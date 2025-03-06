package console_project;

public class TravelDetails {
    private String destination;
    private int tripDuration;
    private String purpose;
    private double totalBudget;
    private ExpenseManager expenseManager; // Add ExpenseManager as a field

    public TravelDetails() {
        this.expenseManager = new ExpenseManager(); // Initialize ExpenseManager by default
    }

    public void setTravelDetails(String destination, int tripDuration, String purpose, double totalBudget) {
        this.destination = destination;
        this.tripDuration = tripDuration;
        this.purpose = purpose;
        this.totalBudget = totalBudget;
    }

    public String getDestination() {
        return destination;
    }

    public int getTripDuration() {
        return tripDuration;
    }

    public String getPurpose() {
        return purpose;
    }

    public double getTotalBudget() {
        return totalBudget;
    }

    public ExpenseManager getExpenseManager() {
        return expenseManager;
    }

    public void setExpenseManager(ExpenseManager expenseManager) {
        this.expenseManager = expenseManager;
    }
}
