package com.company;

public class ModifyReceipt {
    public static void main (String[] args) {

        //calculate the total owed, 8% tax and 15% tip
        double price1 = 38;
        double price2 = 40;
        double price3 = 30;
        double subtotal = price1 + price2 + price3;
        final double tax = 0.08;
        final double tip = 0.15;
        double finalPrice = subtotal + subtotal * tax + subtotal * tip;
        double finalTax = subtotal * tax;
        double finalTip = subtotal * tip;

        System.out.println("Subtotal:" + subtotal);
        System.out.println("Tax:"+ finalTax);
        System.out.println("Tip:"+ finalTip);
        Challengetwo.Line();
        System.out.println("Total:"+ finalPrice);
    }
}
