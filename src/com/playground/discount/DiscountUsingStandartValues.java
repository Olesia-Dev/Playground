package com.playground.discount;

public class DiscountUsingStandartValues {

    public static void main(String[] args) {
        double discount, amount, marketprice, s;
        marketprice = 200;
        discount = 15;
        System.out.println("Marketprice = " + marketprice);
        System.out.println("Discount rate = " + discount);

        s = 100 - discount;
        amount = (s * marketprice) / 100;
        System.out.println("Amount after discount = " + amount);
    }

}
