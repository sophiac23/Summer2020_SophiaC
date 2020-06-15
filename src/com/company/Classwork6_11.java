package com.company;
import java.util.*;
public class Classwork6_11 {
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print ("Type your message here: ");
        String message = keyboard.nextLine();
        message = message.toLowerCase();
        String firstWord = firstword(message);
        int len = firstWord.length();
        System.out.println(" first word is " + len + " characters long");
            char letter = 0;
            int count = 0;
            for (int index =0; index < firstWord.length(); index++) {
                letter = firstWord.charAt(index);
                if (letter != ' ') {
                    count++;
                    String temp = message.substring(index +1);
                    len = temp.indexOf(letter);
                    while (len >= 0) {
                        count++;
                        temp = temp.substring(len + 1);
                        len = temp.indexOf(letter);
                        }
                    firstWord = firstWord.replace(letter, ' ');
                    System.out.println(letter + " " + count);
                    count =0;
                    }
                }
            }
            public static String firstword (String message) {
                int indexOf = message.indexOf(" ");
                String firstword = message.substring (0, indexOf+1);
                System.out.print(firstword);
                return firstword;
            }
}

