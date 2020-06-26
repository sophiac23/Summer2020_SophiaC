package com.company;
import java.io.*; //import file reader
import java.util.*; //import scanner
public class fileTesting {
    public static void main(String[] args) throws FileNotFoundException { //create main
        File file = new File("C:\\Users\\schao\\IdeaProjects\\Summer2020_SophiaC\\src\\com\\company\\weather.txt"); //paste path from file in quotes
        Scanner scan = new Scanner(file); //create new scanner for the file
        //find the difference between 2 consecutive temps
        double temp1=0; //declared outside of loop to prevent problems with local variables
        double temp2=0; //give these a value so that the equation works on the println
        if (scan.hasNextDouble()) {
            temp1 = scan.nextDouble(); //if there is a double in the file, make that =temp1
        }
        while (scan.hasNextLine()){ //if the file has another line
            if(scan.hasNextDouble()){ //if that line has a double
                temp2 =scan.nextDouble(); //temp2 will be equal to that double
                System.out.printf("The difference between %5.2f   and   %5.2f   is %7.2f\n" ,temp1 ,temp2 ,(temp2-temp1)); //print the difference between temp1 and temp2 (in parenthesis to be treated like numbers)
                temp1=temp2;//after the first line, temp2 should become the new temp1
            }
            else{
                String trash =scan.next(); //will consume anything in the file that is a string, not a double
            }
        }
    }
}