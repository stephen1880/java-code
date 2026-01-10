
/*3. Question 3 — 3D Arrays
1.

A shop stores sales data for 2 branches, 2 months, and 3 products using a 3D array.
(a) Declare and initialize the following 3D array:

{
{ {10, 20, 30}, {15, 25, 35} },
{ {5, 10, 15}, {8, 16, 24} }
}
(b) Write a program that prints all elements using 3 nested loops.
(c) Calculate and display the total sales for branch 1 (the first outer array).*/

class ThreeArray {
    public static void main (String[] args) {
        int [][][] sales = {
            {{10, 20, 30  }, {15, 25, 35 }},
            {{5, 10, 15 }, {8, 16, 24 }}
        };
        int totalBranch1 = 0;
        
        for(int [][] branch : sales){
            for(int [] month : branch) {
                for(int item : month) {
                    System.out.println(item);
                }
            }
    }
    
    for (int[] month : sales[0]){
        for(int item : month){
            totalBranch1 += item;
        }
}
System.out.println("Total sales for Branch 1 = " + totalBranch1);
}
}
