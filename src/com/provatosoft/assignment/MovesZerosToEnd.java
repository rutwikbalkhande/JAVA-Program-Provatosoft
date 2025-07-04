package com.provatosoft.assignment;

import java.util.Arrays;

public class MovesZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroesToEnd(arr);
        System.out.println("After moving zeroes: " + Arrays.toString(arr));
    }

    public static void moveZeroesToEnd(int[] arr) {
        int index = 0; // Index to place the next non-zero element

        // Move all non-zero elements to the front
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        // Fill remaining positions with 0
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
