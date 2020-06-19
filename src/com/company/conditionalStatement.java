package com.company;
/* import scanner
create the scanner object
create the main
Print "Pick an integer 1 and 137: "
Get the number from the user
Do while loop to make sure that the number is in between 1 and 37
Define the integer and make it equal to keyboard.nextInt();
Make an if, else if, else if, else
    if number is odd print weird (Do this my finding if the number has a remainder when it is divided by 2. If there is a remainder, it is odd)
    else if number is 2 or 4, print Not Weird
    else if number is even and 6-20, print Weird
    else number is even and greater than 20, print Not Weird
 */
import java.util.*;
public class conditionalStatement {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main (String[] args) {
        Random rand = new Random();
        String answer = "";
        do { //do while
            int number = rand.nextInt(137) +1; //will now be in between 1 and 137
            solve(number);
            System.out.println("Do you want to quit? Type yes or no");
            answer = keyboard.next();
        } while (answer.contains("y")) ; //when the answer contains 'y,' the program will stop`

    }
    public static void solve (int number){
        if (number % 2 == 0) { //determine if number is odd
            System.out.println("Your number is " +number);
            System.out.println("Your number is weird");
        }
        else if (number == 2 || number == 4){ //determine if number is 2 or 4
            System.out.println("Your number is " +number);
            System.out.println("Your number is not weird");
        }
        else if (number < 20) { //determine if number is an even integer 6-20
            System.out.println("Your number is " +number);
            System.out.println("Your number is weird");
        }
        else if (number > 20) { //determine if number is even and greater than 20
            System.out.println("Your number is " +number);
            System.out.println("Your number is weird");
        }
    }
}
