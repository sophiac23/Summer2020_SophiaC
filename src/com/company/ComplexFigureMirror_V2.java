package com.company;
/* This is the program that will print a mirror
Version using for Loop
 06/04/2020*/
public class ComplexFigureMirror_V2 {
    public static final int SIZE =5;

    public static void main(String[] args) { //main method
        //call all my functions
        Line();
        Top();
        Bottom();
        Line();
    }

    public static void Line() {
        System.out.print("#");
        for(int dash=0 ; dash <20 ; dash++){
            System.out.print("-");
        }
        System.out.println("#");
    }

    public static void Top() {//this method prints the top shape
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            spacesDown(line);
            System.out.print("<>");
            for (int dots = 1; dots <= 4 * line - SIZE + 1; dots++) {
                System.out.print(".");
            }
            System.out.print("<>");
            spacesDown(line);
            System.out.println("|");
        }
    }
        public static void spacesDown (int line) {
            for (int space = 1; space <= -2 * line + 2 * SIZE; space++) {
                System.out.print(" ");
            }
        }

        public static void Bottom() { //this method prints the bottom shape
            for (int line = 1; line <= SIZE; line++) {
                System.out.print("|");
                spacesUp(line);
                System.out.print("<>");
                for (int dots = 1; dots <= -4 * line + 4 * SIZE; dots++) {
                    System.out.print(".");
                }
                System.out.print("<>");
                spacesUp(line);
                System.out.println("|");
            }
        }
            public static void spacesUp(int line){
                for(int space=1; space<=2*line-SIZE/2; space++){
                System.out.print(" ");
            }

        }
}
