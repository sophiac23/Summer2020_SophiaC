package com.company;
/* Sophia Chao
Import the scanner
create the main and the scanner
T is the number of words the user wants to break up (1-10 words)
for loop controlled by T (repeat the program by T times)
    ask the user for a word
    declare the string
    print the new word that was sent to the program
Make are return method
    String for the even index letters
    String for the odd index letters
Print all the even index letters, " ", odd index letters using charAt
Make a new println for each word
 */
import java.util.*;
public class stringsChallenge {
    public static Scanner keyboard = new Scanner(System.in);

    public static String[] words = new String[10];

    public static void main (String[] args) {
        int T;
        do {
            System.out.print("Type the number of words in your sentence here (1-10): ");
            T = keyboard.nextInt();
        } while (T<1 || T>10);
        System.out.println("Type words here (Press Enter after each word): ");
        for (int loop = 0; loop <= T; loop++) { //number of loops controlled by T
            words[loop] = keyboard.nextLine();
        }
        for (int loop = 0; loop <= T; loop++) { //number of loops controlled by T
            evenOdd(words[loop]);
        }

    }
    public static void evenOdd(String word) {
        for (int evenLetter = 0; evenLetter < word.length(); evenLetter=evenLetter+2) {
            System.out.print(word.charAt(evenLetter));
        }
        System.out.print(" ");
        for (int oddLetter = 1; oddLetter < word.length(); oddLetter=oddLetter+2) {
            System.out.print(word.charAt(oddLetter));
        }
        System.out.println();
    }
}
