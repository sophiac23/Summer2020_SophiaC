package com.company;
import java.util.Scanner;
// Write a program that outputs a person's "gangsta name."
//–first initial
//–Diddy
//–last name (all caps)
//–first name
//–-izzle
//Example Output:
//Type your name, playa: Marge Simpson
//Your gangsta name is "M. Diddy SIMPSON Marge-izzle"
public class GangstaName {
    public static Scanner keyboard= new Scanner(System. in);
    public static void main(String[] args) {
        System.out.print ("Type your name here: ");
        String fullName = keyboard.nextLine(); //user input (full name)
        System.out.print("Your Gangsta name is: ");
        firstInitial(fullName);
        System.out.print(". Diddy");
        lastname(fullName);
        firstname(fullName);
        int indexOfSpace = fullName.indexOf(" ");
        System.out.print("-izzle");
    }
    public static void firstInitial(String fullName) { //finds the first initial
        char initial = fullName.charAt(0);
        System.out.print(initial);
    }
    public static void lastname(String fullName) { //finds the last name
        int indexOfSpace = fullName.indexOf(" ");
        if(indexOfSpace > 0) { //uses index of space to find last name
            String lastName = fullName.substring(indexOfSpace);
            lastName = lastName.toUpperCase(); //makes last name uppercase
            System.out.print(lastName); //prints last name
        }
    }
    public static void firstname(String fullName) { //finds first name
        int indexOfSpace = fullName.indexOf(" "); //uses index of space to find first name
        String firstName = fullName.substring(0, indexOfSpace);
        System.out.print(" " + firstName); //prints full first name
    }
    public static void userKeyboard(Scanner keyboard) {
        String fullName=keyboard.next();
    }


}
