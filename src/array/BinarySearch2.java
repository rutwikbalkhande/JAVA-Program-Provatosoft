package array;

import java.util.Arrays;

public class BinarySearch2 {

    // binary search work inside sorted Array

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9};
        int target = 9;

        int low = 0;
        int high = arr.length - 1 ;
        int index = -1;  // default: not found
        int loop=1;      // calculate loop how many times run

        while (low <= high) {

            int midIndex = low + (high - low) / 2;

             loop++;                                      //  System.out.println("check loop Run: "+ loop);

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

        System.out.println("check element: " + target);
        System.out.println("Available On index : " +index);
        System.out.println("check loop Run: "+ loop);
    }
}