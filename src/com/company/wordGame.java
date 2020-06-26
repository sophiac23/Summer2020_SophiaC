package com.company;
/* Create file with 20 lines and 20 words in each line (wordGame.txt) (food, integers, doubles)
Import java.io.* and java.util.* (file processors and scanner)
Make welcome picture (variation of Challengeonerocket.java program; first program)
Create the main and throws FileNotFoundException
Create scanner for user input =keyboard
Print “Do you want to guess a number or word?”
Get user input “number” or “word”
Make a do loop
    Create file (File file=new File (pathname)
    Create the scanner for the file = new Scanner(file)
    Make if loop (if answer contains n) → method number
	Ask the user to guess a number
	Make if loop (if answer contains f) → method food
	Ask the user to guess a food
	Make if loop (if answer contains de) → method decimal
	Ask the user to guess a decimal/double
	Look for token in the file
	If the token is not contained in the file
	    System.out.print(“Incorrect”) and +0 points
	If token is contained in the file
	    System.out.print("correct!") and +1 point
		Ask user if they would like to play again (yes or no)
			If answer contains ‘y’
				Print correct! +1 point
			If answer contains ‘n’
			    Print incorrect and  +0 points
	If the number is contained in the file
		Run method correct answer

Create method for number, food, and decimal
	=0 add one every time the guessed word is included in the file
Create return method after user guesses a word/number
Create method for new round(got an answer incorrect)
	Add one to total times played
	Return to asking the user if they want to guess a number or word
Create method for game over
	Print final score and times played
	Ask if they would like to quit
		If answer contains y
			Run game over method
		If answer contains n
			Return to asking the user if they want to guess a number or word
 */
import java.io.*; //import file processor
import java.util.*; //import scanner
public class wordGame {
    public static Scanner keyboard = new Scanner(System.in); //scanner for user input

    public static void main(String[] args) throws FileNotFoundException {
        //welcome picture
        Challengeonerocket.Top();
        Challengeonerocket.Boxone();
        System.out.println("                    |Guessing|");
        System.out.println("                    |  Game  |");
        System.out.println("                    +--------+");
        Challengeonerocket.Boxtwo();
        Challengeonerocket.Top();
        System.out.println(" ");
        System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");

        int points = 0; //sets point value to 0
        int rounds = 1; //number of rounds
        boolean playAgain = true;

        do {
            File file = new File("C:\\Users\\schao\\IdeaProjects\\Summer2020_SophiaC\\src\\wordGame.txt"); //creates file
            Scanner scan = new Scanner(file);
            boolean guessInFile = false;
            System.out.print("Do you want to guess a whole number, food, or decimal? ");
            String numberWord = keyboard.next(); //user inputs if they want to guess a number or a word
            numberWord = numberWord.toLowerCase(); //makes answer lowercase

            if (numberWord.contains("n")) { //if the user wants to guess a whole number
                guessInFile = number(scan, guessInFile); //method
            }
            if (numberWord.contains("f")) { //if the user wants to guess a fruit
                guessInFile = food(scan, guessInFile); // method
            }
            if (numberWord.contains("de")) { //if the user wants to guess a decimal
                guessInFile = decimal(scan, guessInFile); // method
            }

            if (guessInFile) {
                points++;
                System.out.println("   correct!");
                System.out.println("☆ +1 point ☆");
            } else {
                System.out.println("incorrect");
                System.out.println("+0 points");
            }

            System.out.println("Would you like to try again? ");
            String tryAgain = keyboard.next();
            tryAgain = tryAgain.toLowerCase(); //makes answer lowercase
            System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");

            if (tryAgain.contains("y")) { //the user wants to try again
                rounds++;
                playAgain = true;
            }
            else if (tryAgain.contains("n")) { //the user wants to quit the game
                playAgain = false;
            }
           scan.close();
        } while (playAgain);

        //print results and end game
        System.out.println("☆ game over ☆");
        System.out.println("   Rounds:" + rounds);
        System.out.println("   Points:" + points);
        System.out.println("Thanks for playing!");

    }

    public static boolean number(Scanner scan, boolean guessInFile) { //when the user wants to guess a whole number
        System.out.print("Type your whole number guess here: ");
        int numberGuess = keyboard.nextInt(); //where the user inputs their number guess
        int temp = 0;
        boolean thistemp = false;
        while (scan.hasNextLine()) { //if that line has an integer
            if (scan.hasNextInt()) {
                temp = scan.nextInt(); //temp is equal to the integer from the file
                if (numberGuess == temp) { //if the guessed number is equal to the next integer
                    thistemp = true; //add to the count, in the main if count>=1, a point will be added
                    break;
                }
            } else {
                String trash = scan.next();
            }
        }
        return thistemp;
    }

    public static boolean food (Scanner scan, boolean guessInFile) {
        System.out.print("Guess a food item: ");
        String foodGuess = keyboard.next(); //where the user inputs their food guess
        foodGuess = foodGuess.toLowerCase(); //makes answer lowercase
        String temp2 = ("");
        boolean thistemp = false;
        while (scan.hasNextLine()) { //if the file has another line
            if (scan.hasNext()) { //if that line has a food name
                temp2 = scan.next();
                if (temp2.equals(foodGuess)) { //if the food matches with the guessed food
                    thistemp = true;
                    break;
                }
            }
        }
        return thistemp;
    }

    public static boolean decimal (Scanner scan, boolean guessInFile) {
        System.out.print("Type your decimal here: ");
        double decimalGuess = keyboard.nextDouble(); //where the user inputs their number guess
        decimalGuess =(((int) (decimalGuess*100))/100.0);
        double temp3 = 0.0;
        boolean thistemp = false;
        while (scan.hasNextLine()) { //if the file has another line
            if (scan.hasNextDouble()) { //if that line has a double
                temp3 = scan.nextDouble();
                if (decimalGuess == temp3) { //if the guessed number is equal to the next double
                    thistemp = true;
                    break;
                }
            }
            else {
                String trash = scan.next();
            }
        }
        return thistemp;
    }
}

