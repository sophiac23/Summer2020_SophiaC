package com.company;
/* This is the program that will print a mirror
 06/03/2020*/
public class ComplexFigureMirror {

    public static void main(String[] args) { //main method
        Topbottom();
        Vertex();
        Fourspaces();
        Twospaces();
        Completeline();
        Completeline();
        Twospaces();
        Fourspaces();
        Vertex();
        Topbottom();
    }
    public static void Topbottom() { //this method prints the top and bottom of the image
        System.out.println("#================#");
    }
    public static void Vertex() { //this method prints rows 2 and 9 of the image
        System.out.println("|      <><>      |");
    }
    public static void Fourspaces() { //this method prints rows 3 and 8 of the image
        System.out.println("|    <>....<>    |");
    }
    public static void Twospaces() { //this method prints rows 4 and 7 of the image
        System.out.println("|  <>........<>  |");
    }
    public static void Completeline() { //this method prints rows 5 and 6 of the image
        System.out.println("|<>............<>|");
    }
}

