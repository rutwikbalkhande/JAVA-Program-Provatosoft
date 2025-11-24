package array;

import java.util.Arrays;

public class BinarySearch2 {

    // binary search work inside sorted Array

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9};
        int target = 6;

        int low = 0;
        int high = arr.length - 1;
        int index = -1;  // default: not found
        int loop=1;      // calculate loop how many times run

        while (low <= high) {

            int midIndex = low + (high - low) / 2;

            System.out.println("loop: "+ loop);
            loop++;

            if (arr[midIndex] == target) {
                index = midIndex;
                break; // element found
            }

            if (target < arr[midIndex]) {
                high = midIndex - 1; // go left
            } else {
                low = midIndex + 1;  // go right
            }
        }

        System.out.println("index : " +index);
    }
}