package com.company;
/* Sophia Chao
import java.util.*
Create scanner
Create the main
declare integer days
Do
    Get user input for number of days using keyboard scanner
While
    days<2 || days>100
    create new integer for array
    create new random
Make a for loop
    create array equal to random number from 25 to 110 (bound 85)+25
    Print line for Day (index+1) temperature is (array)
Get the average of the random numbers (sum of all random numbers/days)
Print the average
 */
import java.util.*;
public class classwork6_22<averageTemp> {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int days;

        do {
            System.out.print("Type the number of days here (1-100): ");
            days = keyboard.nextInt();
        } while (days < 2 || days > 100);
        int[] myArray = new int[days];
        Random randy = new Random();
        int dailyTemps = 0;
        for (int index = 0; index < myArray.length; index++) {
            myArray[index] = randy.nextInt(85) + 25;
            System.out.println("Day " + (index + 1) + " temperature is: " + myArray[index]);
            dailyTemps = dailyTemps + myArray[index];
        }
        double averageTemp = (double) dailyTemps / days;
        System.out.println(averageTemp);

        int countAbove =0; //gets the number of temperatures above the average
        for(int i=0; i< myArray.length; i++) {
            if(myArray[i] > averageTemp) {
                countAbove++;
            }
        }
        System.out.println(countAbove + " days were above the average temperature.");
    }
}
