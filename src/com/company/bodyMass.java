package com.company;
import java.util.Scanner;
public class bodyMass {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Height 1 (inches): ");
        double height1 = keyboard.nextDouble();
        System.out.print("Weight 1 (lbs): ");
        double weight1 = keyboard.nextDouble();
        double formula1 = Math.pow(height1, 2);
        double bmi1 = weight1 / formula1 * 703;

        System.out.print("Height 2 (inches): ");
        double height2 = keyboard.nextDouble();
        System.out.print("Weight 2 (lbs): ");
        double weight2 = keyboard.nextDouble();
        double formula2 = Math.pow(height2, 2);
        double bmi2 = weight2 / formula2 *703;

        //person 1
        if(bmi1 >= 30) {
            System.out.println("BMI of person 1 is " + bmi1);
            System.out.println("Obese");
        }
        else if(bmi1 >= 25){
            System.out.println("BMI of person 1 is " + bmi1);
            System.out.println("Overweight");
        }
        else if(bmi1 >= 18.5){
            System.out.println("BMI of person 1 is " + bmi1);
            System.out.println("Normal");
        }
        else if(bmi1 < 18.5) {
            System.out.println("BMI of person 1 is " + bmi1);
            System.out.println("Underweight");
        }

        //person 2
        if(bmi2 >= 30) {
            System.out.println("BMI of person 2 is " + bmi2);
            System.out.println("Obese");
        }
        else if(bmi2 >= 25){
            System.out.println("BMI of person 2 is " + bmi2);
            System.out.println("Overweight");
        }
        else if(bmi2 >= 18.5){
            System.out.println("BMI of person 2 is " + bmi2);
            System.out.println("Normal");
        }
        else if(bmi2 < 18.5) {
            System.out.println("BMI of person 2 is " + bmi2);
            System.out.println("Underweight");
        }
        double difference = Math.abs(bmi1 - bmi2);
        System.out.println("Difference: " + difference);
    }
}
