import java.util.Scanner;
import java.text.DecimalFormat;
class Product {
    
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        
        if (percentage >= 0) {
           
            double multiplier = 1.0 - (percentage / 100.0);
            this.price *= multiplier;

            if (this.price < 0) {
                this.price = 0;
            }
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}

public class DiscountCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        DecimalFormat df = new DecimalFormat("#.00");

        product)
        String productName = "Wireless Headphones";
        double initialPrice = 199.99;
        
        Product headphones = new Product(productName, initialPrice);

        System.out.println(" Online Store Discount Calculator ");
        System.out.println("Product: " + headphones.getName());
        System.out.println("Original Price: $" + df.format(initialPrice));

        double discountPercentage = 0.0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("\nEnter the discount percentage to apply (e.g., 20 for 20%): ");
            if (scanner.hasNextDouble()) {
                discountPercentage = scanner.nextDouble();
                if (discountPercentage >= 0) {
                    validInput = true;
                } else {
                    System.out.println("Discount percentage must be non-negative. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        headphones.applyDiscount(discountPercentage);

       
        System.out.println("\n--- Discount Applied ---");
        System.out.println("Discount Percentage: " + df.format(discountPercentage) + "%");
        System.out.println("New Price of " + headphones.getName() + ": $" + df.format(headphones.getPrice()));

        scanner.close();
    }
}