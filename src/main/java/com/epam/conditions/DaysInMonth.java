package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        if (month == 2) {
            boolean isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
            if (isLeapYear){
                System.out.println("29");
            }
            else {
                System.out.println("28");
            }
            return;
        }

        System.out.println(month % 2 == 0 ? "30" : "31");

    }

}
