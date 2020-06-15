package com.company;
/* This is the program that will print challenge 2
 06/05/2020*/
public class Challengetwo {
    public static final int SIZE =5; //control the size here
    public static void main(String[] args) { //main method
        //call all my functions
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }

    public static void Line() { //this method prints the line
        System.out.print("+");
        for(int dash=0 ; dash < 2*SIZE-1 ; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void Top() { //this method prints the top shape
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            spacesDown(line);
            for (int fslash = 1; fslash < line; fslash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int bslash = 1; bslash < line; bslash++) {
                System.out.print("\\");
            }
            spacesDown(line);
            System.out.println("|");
        }
    }
        public static void spacesDown (int line) { //reduces the number of spaces going down
            for (int space = 1; space <= -line+SIZE; space++) {
                System.out.print(" ");
            }
        }

            public static void Bottom() { //this method prints the bottom of the shape
                for (int line = 1; line <= SIZE; line++) {
                    System.out.print("|");
                    spacesUp(line);
                    for (int bslash = 1; bslash <= SIZE-line; bslash++) {
                        System.out.print("\\");
                    }
                    System.out.print("*");
                    for (int fslash = 1; fslash <= SIZE-line; fslash++) {
                        System.out.print("/");
                    }
                    spacesUp(line);
                    System.out.println("|");
            }
        }
            public static void spacesUp(int line){ //increases number of spaces going down
                for(int space=0; space<= line-2; space++){
                System.out.print(" ");
            }

        }
}
