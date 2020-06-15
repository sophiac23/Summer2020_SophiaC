package com.company;

public class StringExamples {
    public static void main(String[] args) {
        String name= "Sophia";
        sayHi(name);
        Challengetwo.Line();
        String teacher = "Maria Suarez is the Teacher in the School";
        sayHi(teacher);
        Challengetwo.Line();
        String letter = "I";
        sayHi(letter);
    }
    public static void sayHi(String name) {
        System.out.println("Hi "+ name.toUpperCase());
        Challengetwo.Line();
        int len= name.length();
        System.out.println("Your name is "+ len + " characters long");
        int indexOf= name.indexOf("a");
        System.out.println("The letter a is at index "+ indexOf);
        String partial;
        if(indexOf > 0){
            partial = name.substring(indexOf +1);
            //give you the string from that index to the end
            System.out.println(partial);
        }
        if( name.length()>4) {
            partial = name.substring(1, indexOf);
            char letter = name.charAt(4);
            System.out.println("the letter at index 4 is " + letter);
        }
    }
}
