package console_project;

public class ExpenseManager {
    private double transportationCost;
    private double accommodationCost;
    private double mealsCost;
    private double activitiesCost;

    public void setExpenses(double transportation, double accommodation, double meals, double activities) {
        this.transportationCost = transportation;
        this.accommodationCost = accommodation;
        this.mealsCost = meals;
        this.activitiesCost = activities;
    }

    public double getTotalSpent() {
        return transportationCost + accommodationCost + mealsCost + activitiesCost;
    }

    public double getTransportationCost() {
        return transportationCost;
    }

    public double getAccommodationCost() {
        return accommodationCost;
    }

    public double getMealsCost() {
        return mealsCost;
    }

    public double getActivitiesCost() {
        return activitiesCost;
    }
}
