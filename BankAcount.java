
A bank needs a program to manage different types of accounts.
Create a superclass BankAccount with an attribute balance and a method deposit().
Then create a subclass SavingsAccount that inherits from BankAccount and adds a
method addInterest() that increases the balance by 5%.
Write a Java program that:
1. Creates a SavingsAccount object,
2. Deposits an amount entered by the user,
3. Applies interest,
4. Displays the final balance.*/
import java.util.Scanner;

class BankAccount {

    double balance;
    void deposit(double amount) {
        balance = balance + amount;
    }
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        balance = balance + (balance * 0.05);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount();

        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();

        account.deposit(amount);

        account.addInterest();

        System.out.println("Final balance after interest: " + account.balance);

        input.close();
    }
}