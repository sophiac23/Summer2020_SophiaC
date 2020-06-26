package com.company;
import java.io.*; //import file processor
import java.util.*; //import scanner
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class wordGameTest {
    public static Scanner keyboard = new Scanner(System.in); //scanner for user input

    public static void main(String[] args) throws FileNotFoundException {
        int points = 0; //sets point value to 0

        int rounds = 0; //number of rounds
        File file = new File("C:\\Users\\schao\\IdeaProjects\\Summer2020_SophiaC\\src\\wordGame.txt"); //creates file
        Scanner scan = new Scanner(file); //scanner for the file
        boolean playAgain = true;

        do {
            int count = 0;
            System.out.print("Do you want to guess a whole number, food, or decimal? ");
            String numberWord = keyboard.nextLine(); //user inputs if they want to guess a number or a word
            numberWord = numberWord.toLowerCase(); //makes answer lowercase

            if (numberWord.contains("n")) { //if the user wants to guess a whole number
                System.out.print("Type your whole number guess here: ");
                int numberGuess = keyboard.nextInt(); //where the user inputs their number guess
                int temp = 0;
                while (scan.hasNextLine()) { //if that line has an integer
                    if (scan.hasNextInt()) {
                        temp = scan.nextInt(); //temp is equal to the integer from the file
                        System.out.println(temp);
                        if (numberGuess == temp) { //if the guessed number is equal to the next integer
                            count++; //add to the count, in the main if count>=1, a point will be added
                            break;
                        }
                    } else {
                        String trash = scan.next();
                    }
                }
            }
          //  if (numberWord.contains("f")) { //if the user wants to guess a fruit
          //      food(scan, count, keyboard); // method
          //  }
            //if (numberWord.contains("de")) { //if the user wants to guess a decimal
            //    decimal(scan, count, keyboard); // method
           // }

            if (count >= 1) {
                points++;
                System.out.println("correct!");
            } else {
                System.out.println("incorrect");
                rounds++;
            }

            System.out.println("Would you like to try again? ");
            String tryAgain = keyboard.nextLine();
            tryAgain = tryAgain.toLowerCase(); //makes answer lowercase

            if (tryAgain.contains("y")) { //the user wants to try again
                rounds++;
                playAgain = true;
            }
            if (tryAgain.contains("n")) { //the user wants to quit the game
                playAgain = false;
            }
        } while (playAgain);

        //print results and end game
        System.out.println("Attempts:" + rounds);
        System.out.println("Points:" + points);
        System.out.print("game over");

    }
}
