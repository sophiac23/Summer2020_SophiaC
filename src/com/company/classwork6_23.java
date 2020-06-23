package com.company;
/* Sophia Chao
import java.util.* for the random number generator
create the main
    create the random number generator
    declare the random number generator
    make the array (the random number will determine how many numbers will be in the array)
        declare integer num2 make it equal to new int[]
        make a for loop (integer i)
            create the random number (bound 5)+5 //range+minimum
    Make method swap
        make a random number to determine which indexes in the array to swap (randIndex1)
        make a second random number that will swap with the first random number (randIndex2)
            int temp =array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i]=temp;
    Print the original and swapped arrays
 */
import java.util.*; //import for random number generator
public class classwork6_23 {
    Random rand = new Random(); //declare random number generator

    public static void main(String[] args) {
        Random rand = new Random(); //declare random number generator
        int size = rand.nextInt(5) + 5; //creates the random number
        int[] array = new int[size]; //creates the array
        for (int i = 0; i < array.length; i++) { //creates array
            array[i] = rand.nextInt(90) + 10;
        }
        int index1;
        int index2;
        do {
            index1 = rand.nextInt(size);
            index2 = rand.nextInt(size);
        } while (index1 == index2);
        System.out.println(Arrays.toString(array));
        swap(array, index1, index2);
        System.out.println(Arrays.toString(array));
    }

    public static int [] swap(int[] array, int index1, int index2) {//swaps 2 random indexes in the array
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return array;
    }
}
