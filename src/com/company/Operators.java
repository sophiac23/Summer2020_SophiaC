package com.company;
/* Sophia Chao
Import Scanner
Create scanner object
Create main
Print places for the user to input data (Meal price, tip %, Tax rate)
Get user inputs for meal price, tip percent, and tax rate using scanner
Print the meal price (the original one before tax and tip)
Create the method static void solve(double mealCost, int tipPercent, integer taxRate){}
    Print integer Tip by using the equation mealcost x (tip% / 100)
    Print integer Tax by using the equation mealcost x (tax% / 100)
    Print the total cost of the meal using meal price + tip + tax and then round the number to the nearest integer
Back in the main, print the Tip, Tax, and total cost.
*/
import java.util.Scanner;
public class Operators {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double tip =0.0;
        double tax =0.0;
        double totalCost =0.0;
        System.out.print("Original cost of meal: $");
        double ogCost = keyboard.nextDouble();
        System.out.print("Tip %: ");
        int tipPercent = keyboard.nextInt();
        System.out.print("Tax rate: ");
        int taxRate = keyboard.nextInt();
        solve(ogCost, tipPercent, taxRate);
    }

    public static void solve (double ogCost, int tipPercent, int taxRate) {
        double tip = tipPercent / 100.0 *ogCost;
        double tax = taxRate / 100.0 *ogCost;
        double totalCost = Math.round(ogCost + tip + tax);
        System.out.printf("Tip= $%1.2f \n" ,tip);
        System.out.printf("Tax= $%1.2f \n" ,tax);
        System.out.printf("Total= $%1.2f \n" ,totalCost);
    }
}
