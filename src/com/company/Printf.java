package com.company;

public class Printf {
    public static void main(String[] args) {
        double first= 123.456;
        double second= 456.789;
        double third= 789.123;
        int num1 = (int) Math.sqrt(420);
        int num2 = (int) Math.abs(-50.78);
        int num3 = (int) Math.round(9.876);
        System.out.printf("printf practice \n %5.3f \n %5.3f \n %5.3f " +
                "\n %3d \n %3d \n %3d", first,second,third,num1,num2,num3);
    }
}

