package array;

import java.util.Arrays;

public class BinarySearch {

    // Binary search work with sorted Array if not sorted give wrong output  search no. on whiuch position
    public static void main(String[] args) {

        int arr[]={1,5,3,4,6,8,9,4,7,6};

        Arrays.sort(arr);   //must sort before binary search

        int index= Arrays.binarySearch(arr,5);
        System.out.println("sorted Array: " + Arrays.toString(arr));
        System.out.println("search 5, index=2 :" + index);
    }
}
