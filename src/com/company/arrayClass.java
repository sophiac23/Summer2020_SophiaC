package com.company;
import java.util.*;
public class arrayClass {
    public static void main (String[] args) {
        //declare an array
        int[] numbers ={3,5,12,43,5,76,9,1};
        int len=numbers.length;
        System.out.println("The array " +Arrays.toString(numbers)+" has " +len+ " elements");
        //create a random object to feed my new array
        Random rand = new Random(); //the seed in this statement ...this is to create the object
        int[] num2=new int[6];
        for (int i=0; i< num2.length; i++){
            num2[i]=rand.nextInt(70)+20; //bound is always the range of your values+minimum value
        }
        System.out.println(Arrays.toString(num2)); //prints first string of numbers
        num2 =reverse(num2); //reverses order of numbers (look in method reverse below
        System.out.println(Arrays.toString(num2)); //prints reversed string of numbers
    }
    public static int[] reverse(int [] array) { //reverses the order of the numbers
        for (int i=0; i <array.length/2; i++) { //for loop only has to happen half the length to swap indexes (length/2)
            int temp =array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]=temp;
        }
        return array; //return to the main program
    }
}
