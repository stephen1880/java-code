 /*Topic: Arrays
Question 1 — 1D Arrays
1.
(a) Declare and initialize a 1D array of integers with the following values:
5, 10, 15, 20, 25
(b) Using a for loop, print all the elements.
(c) Calculate and display the sum of all elements in the array.*/
class Main{
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        
        System.out.println("Arrys elements: ");
        for(int i = 0 ; i < numbers.length; i++){
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);
    }
}
2.
(1D Array – Shopping Cart)
A supermarket app stores the prices of 6 items in a 1D array:
{120, 80, 150, 60, 200, 90}
Write a Java program to:
1. Print all the item prices
2. Calculate and display the total amount the customer must pay*/
class Main{
    public static void main(String[] args){
        
        int [] prices = { 120, 80, 150, 60, 200, 90};
        
        int total = 0;
        
        System.out.println("Item price: ");
        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
            total += prices[i];
            
        }
        
        System.out.println("Total amount = " + total);
    }
}