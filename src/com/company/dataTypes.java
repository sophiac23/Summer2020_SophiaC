package com.company;
import java.util.*;
/*Import scanner
        Create new scanner object
        Create the main
        Declare and initialize variables integer i and double d
        String s = “Greenhill”
        Print “Type your inputs below”
        Get user input for integer, decimal, and string (Finish the sentence: Greenhill... using the scanner keyboard
        Double integer = user input for integer + i
        Print on new line d + double variable with one decimal place (.1)
        Print Greenhill… (user input)
 */

public class dataTypes {
    public static Scanner keyboard= new Scanner(System. in);
    public static void main (String[] args) {
        int i =4;
        double d =4.0;
        String s = "Greenhill";
        System.out.println("Type your inputs below: ");
        integer();
        decimal();
        phrase();


    }
    public static void integer() {
        System.out.print("Integer: ");
        String integer = keyboard.nextLine();
    }
    public static void decimal() {
        System.out.print("Decimal: ");
        String decimal = keyboard.nextLine();
    }
    public static void phrase() {
        System.out.print("Phrase: ");
        String phrase = keyboard.nextLine();
    }
}
