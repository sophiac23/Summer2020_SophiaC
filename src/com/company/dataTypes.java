package com.company;
import java.util.*;
/*
Sophia Chao
        Import scanner
        Create new scanner object
        Create the main
        Declare and initialize variables integer i and double d
        String s = “Greenhill”
        Create variables and create methods for each (integer, double, and string)
        Print “Type your inputs below”
        Get user input for integer, decimal, and string (Finish the sentence: Greenhill...) using the scanner keyboard
        Double integer = user input for integer + i
        Print on new line d + double variable with one decimal place (.1) using System.out.printf
        Print Greenhill… (user input)
 */

public class dataTypes {
    public static Scanner keyboard= new Scanner(System. in);
    public static void main (String[] args) {
        int i =4;
        double d =4.0;
        String s ="Greenhill";
        System.out.println("Type your inputs here:");
        System.out.print("Integer: ");
        int myInt = keyboard.nextInt();
        System.out.print("Double: ");
        double myDouble = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.print("Phrase: Greenhill ");
        String myString = keyboard.nextLine();
        System.out.printf("\n %3d" ,myInt +i);
        System.out.printf("\n %2.1f" ,myDouble +d);
        System.out.printf("\n %1s" ,s + " " + myString);

    }

}
