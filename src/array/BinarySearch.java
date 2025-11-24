package array;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    // Binary search work with sorted Array if not sorted give wrong output  search no. on whiuch position
    // Time complexity = " O(n log n ) "
    public static void main(String[] args) {

        int arr[]={1,5,3,4,6,8,9,4,7,6};

        Arrays.sort(arr);   //must sort before binary search

        int index= Arrays.binarySearch(arr,4);

        System.out.println("sorted Array: " + Arrays.toString(arr));

        if(index <0){
            index=-1;       // return -1 if value not found
            System.out.println(index);
        }
      else{

            System.out.println("search 5, index= " + index);
        }

    }
}
