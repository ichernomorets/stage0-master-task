package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; ++i) {
            for (int j = cathetusLength -1; j >= 0; --j) {
                if(j < i + 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
