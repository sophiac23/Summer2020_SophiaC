package com.company;
/* This is Challenge one
I will print a picture of a rocket
 06/03/2020*/
public class Challengeonerocket {

    public static void main(String[] args) { //main method
        Top();
        Boxone();
        System.out.println("|United|");
        System.out.println("|States|");
        System.out.println("+------+");
        Boxtwo();
        Top();
    }
    public static void Top() //this method prints the top and bottom of the rocket
    {
        System.out.println("                        /\\   ");
        System.out.println("                       /  \\   ");
        System.out.println("                      /    \\  ");
        System.out.println("                     /      \\ ");}
    public static void Boxone() {
        System.out.println("                    +--------+");
        System.out.println("                    |        |");
        System.out.println("                    |        |");
        System.out.println("                    +--------+");
    }
    public static void Boxtwo() {
        System.out.println("                    |        |");
        System.out.println("                    |        |");
        System.out.println("                    +--------+");
    }
}

