package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[] {"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] result = new int[length];

        for (int i = 0; i < length; ++i) {
            result[i] = i + 1;
        }

        return result;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] result = new String[arr.length];

        for (int i = 0; i < arr.length; ++i) {
            result[arr.length - i - 1] = arr[i];
        }

        return result;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int positiveCount = 0;
        for (int i = 0; i < arr.length; ++i) {
            if(arr[i] > 0) {
                ++positiveCount;
            }
        }

        int[] result = new int[positiveCount];
        int resultInd = 0;
        for (int i = 0; i < arr.length; ++i) {
            if(arr[i] > 0) {
                result[resultInd] = arr[i];
                ++resultInd;
            }
        }

        return result;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[][] sorted = arr.clone();

        // arrange by ascending order by length
        for (int i = 0; i < sorted.length; ++i) {
            for (int j = 0; j < sorted.length - i - 1; ++j) {
                if (sorted[j].length > sorted[j+1].length) {
                    int[] t = sorted[j+1];
                    sorted[j+1] = sorted[j];
                    sorted[j] = t;
                }
            }

        }

        //sort numbers inside each array
        for (int k = 0; k < sorted.length; ++k) {
            int[] currArr = sorted[k];
            for (int i = 0; i < currArr.length; ++i) {
                for (int j = i+1; j < currArr.length; ++j) {
                    if (currArr[i] > currArr[j]) {
                        int t = currArr[j];
                        currArr[j] = currArr[i];
                        currArr[i] = t;
                    }
                }
            }
        }

        return sorted;
    }
}
