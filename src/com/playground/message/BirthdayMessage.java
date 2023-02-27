package com.playground.message;

import java.time.LocalDate;
import java.time.Month;

public class BirthdayMessage {

    public static void main(String[] args) {
        int birthDate = 31;
        Month birthMonth = Month.MARCH;

        LocalDate currentDate = LocalDate.now();
        System.out.println("Today's date :" + currentDate);

        int date = currentDate.getDayOfMonth();
        Month month = currentDate.getMonth();

        if (date == birthDate && month == birthMonth) {
            System.out.println("Happy Birthday to you!");
        }
        else {
            System.out.println("Today is not my Birthday!");
        }
    }

}
