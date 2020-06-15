package com.company;
import java.util.*;
public class testing {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String answer;
            Random rand = new Random(); //Creates a new random object
                double doubly1 = 9.98;
                double doubly2 = doubly1 * 3.234234;
                double doubly3 = doubly2 / 2.345345;
                int num1 = 345;
                int num2 = -58;
            do { //do while
                int randy = rand.nextInt(10) +75; //will now be in between 75 and 80 +will add that number to the random generated number
                System.out.printf("My random number is: %1d \n", randy);
                System.out.println("Do you want to quit? Type yes or no");
                answer = input.next();
            }
            while(answer.contains("n") ); //when the answer contains the letter n a new letter will be given
            String whatEver="Greenhill is awesome";
            System.out.printf("Showing how to use printf \n $%10.3f \n $%10.3f \n $%10.3f \n -%6d \n -%6d \n %20.20s" ,doubly1,doubly2,doubly3,num1,num2,whatEver);

        }
}
