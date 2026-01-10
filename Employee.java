/*QUESTION 3
A university system manages employees using inheritance.
Create a superclass Employee with attributes name and salary, and a method
displayInfo().
Create a subclass Lecturer that adds an attribute department and overrides displayInfo()
to include department information.

Write a Java program that:
1. Accepts input from the user for name, salary, and department,
2. Creates a Lecturer object,
3. Displays all information using the overridden method.*/
import java.util.Scanner;

class Employee{
    Employee(){
        System.out.println("I am an employee");
    }
    Employee(String name, double salary){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Lecturer extends Employee {
    Lecturer(){
        super("Lecturer", 0);
        System.out.println("I am a lecturer");
    }
    Lecturer(String name, double salary, String department){
        super(name, salary);
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        System.out.print("Enter salary :");
        double salary = input.nextDouble();
        input.nextLine();
        
        System.out.print("Enter department: ");
        String department = input.nextLine();
        
        Lecturer lecturer1 = new Lecturer(name, salary, department);
        
        input.close();
        
    }
 }
 