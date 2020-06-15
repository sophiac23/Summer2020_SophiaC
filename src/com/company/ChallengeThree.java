package com.company;

public class ChallengeThree {
    public static final int SIZE = 6; //control the amount of letters printed here

    public static void main(String[] args) { //main method
        //call all of my functions

        Top();
        Bottom();
    }

    public static void Top() { //this method prints the top half of the K
        for (int line = SIZE; line > 0; line--) {
            for (int letters = 0; letters < line; letters++) {
                System.out.print((char) (65 + letters));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void Bottom() { //this method prints the bottom half of the K
        for (int line = 1; line <= SIZE; line++) {
            for (int letters = 0; letters < line; letters++) {
                System.out.print((char) (65 + letters));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
