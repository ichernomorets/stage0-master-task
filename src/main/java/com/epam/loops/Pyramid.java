package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i < cathetusLength + 1; ++i) {
            for (int j = -cathetusLength; j < cathetusLength + 1; ++j) {
                if(j == 0 || j == -1) {
                    continue;
                }
                if(j >= i + 1) {
                    break;
                }

                int num = j < 0 ? -j : j;
                if(num < i + 1) {
                    System.out.print(num);
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
