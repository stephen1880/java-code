public class VacationCost {
    
    // Method to calculate total cost
    public static double calculateTotalCost(double accommodationCost, double mealCost, double activityCost) {
        return accommodationCost + mealCost + activityCost;
    }
    
    public static void main(String[] args) {
        double accommodation = 800.50;
        double meals = 400.25;
        double activities = 250.00;
        
        double totalCost = calculateTotalCost(accommodation, meals, activities);
        System.out.println("Total Vacation Cost: $" + totalCost);
    }
}
