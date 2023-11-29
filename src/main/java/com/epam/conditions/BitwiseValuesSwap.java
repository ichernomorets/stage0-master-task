package com.epam.conditions;

public class BitwiseValuesSwap {

    public void swap(int first, int second) {
        first ^= second;
        second ^= first;
        first ^= second;

        System.out.println(first);
        System.out.println(second);
    }

}
