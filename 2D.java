
/*Question 2 — 2D Arrays
1.
Write a Java program that:

(a) Declares and initializes a 2D array containing student marks:
{
{80, 70, 90},
{60, 85, 75},
{88, 92, 79}
}
(b) Uses nested loops to print all the marks in matrix form.
(c) Calculates and prints the average mark of the first row.*/

class MultidimensionalArray {
    public static void main (String[] args) {
    int [] [] marks = {
        {80, 70, 90 },
        {60, 85, 75 },
        {88, 92, 79 }
    };
    int sum = 0;
    
    for(int i = 0; i < marks.length; ++i){
        for (int j = 0; j< marks[i].length; ++j){
            System.out.print(marks[i][j] + " ");
        }
        System.out.println();
    }
    for(int j = 0; j < marks[0].length; ++j){
        sum += marks[0][j];
    }
    double average = (double) sum / marks[0].length;
    System.out.println("Average of first row = " + average);
    }  
}

/*(2D Array – Student Marks Table)
A teacher records marks for 3 students across 3 subjects using a 2D array:
{
{75, 80, 90}, // Student 1
{65, 70, 85}, // Student 2
{88, 92, 81} // Student 3
}
Write a Java program to:
1. Print the marks in table (matrix) form
2. Calculate and print the average marks of Student 3*/

class multidimensionalArray {
    public static void main(String[] args) {
        int [][] marks = {
            {75, 80, 90},
            {65, 70, 85},
            {88, 92, 81}
        } ;
        int sum = 0;
        for(int[] student : marks){
            for(int mark : student){
                System.out.print(mark + " ");
            }
            System.out.println();
        }
        for(int mark : marks[2]){
            sum += mark;
        }
        double average = (double) sum / marks[2].length;
        System.out.println("Average marks of Student 3 = " + average);
    }
}
