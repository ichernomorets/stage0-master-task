package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int digit1 = number / 1000;
        int digit2 = number / 100 - digit1 * 10;
        int digit3 = number / 10 - digit2 * 10 - digit1 * 100;
        int digit4 = number % 10;

        int sum = digit1 + digit2 + digit3 + digit4;
        System.out.println(sum);
    }

}
