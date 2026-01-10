/*
Topic: Inheritance in Java
QUESTION 1
A car rental company wants to keep track of different types of vehicles.
Create a parent class Vehicle with attributes brand and year.
Then create a child class Car that inherits from Vehicle and adds an attribute seats.
Write a Java program that:
1. Creates a Car object,
2. Assigns values to all attributes,
3. Prints all the details.*/

class Vehicle {

    String brand;
    int year;
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

class Car extends Vehicle {

    int seats;

    Car(String brand, int year, int seats) {
        super(brand, year); 
        this.seats = seats;
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Year : " + year);
        System.out.println("Seats : " + seats);
    }
}

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 2007, 14);

        myCar.displayDetails();
    }
}