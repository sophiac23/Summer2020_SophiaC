package com.company;
import java.util.*;
public class arraysAndThings {
    public static void main (String[] args) { //this is a String array (args = argument)
        Random randomNumber = new Random();
        int[] myArray = new int[10];
        for (int index = 0; index < myArray.length; index++) { //create a for loop (index will always be less than the length)
            myArray[index] = randomNumber.nextInt(100) + 1; //will create a random number between 1-100 (inclusive)
            System.out.println("the value of the array at index " + index + " is " + myArray[index]);
        }
        double[] doubleArray = new double[10];
        for (int index = 0; index < doubleArray.length; index++) { //second array with a double
            doubleArray[index] = randomNumber.nextDouble() * 100; //random double (1-100 inclusive)
            System.out.printf("the value of the array at index %d is %.2f \n" ,index, doubleArray[index]); //will round the random number to 2 decimal places
        }
        String[] names = {"Sophia", "Erica", "Nuha", "Joohan", "Tej"};
        Arrays.sort(names); //sorts the names
        String[] testingArray =new String[10];
        Arrays.fill(testingArray,"a"); //will replace names without an r with an a
        for (int i = 0; i < names.length; i++) {
            System.out.println(testingArray[i]);
            System.out.println(names[i]);
 //           if (names[i].contains("r")) { //will only print names that contain'r'
//                System.out.println(names[i]); //prints names
 //           }
        }
    }
}
