package array;

import java.util.*;

public class KthElementSortedArrays {

    //  finds the K-th smallest element from two sorted arrays
    /*
    nums1 = [2, 3, 6, 7, 9];    // size = 5
     nums2 = [1, 4, 8, 10];      // size = 4
      k = 5;
      output:The 5-th smallest element in the merged sorted array is: 6
      space complexity: O(1)
     */

    public static long findKthEleApproch2(int[] array1, int[] array2,int k) {

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        if (array1.length + array2.length > k) {
            // throw new  BadRequestException();
        }
        int x = 0, y = 0;
        for (int i = 0; i < array1.length + array2.length; i++) {
            if (array1[x] < array2[y]) {

                if (i == k - 1) {
                    return array1[x];
                }
                x++;
            }
            else{
                if (i == k - 1) {
                    return array2[y];
                }
                y++;
            }
        }
             return 0;
    }



    public static void main(String[] args) {
        int[] nums1 = {2, 3, 6, 7, 9};
        int[] nums2 = {1, 4, 8, 10};

        int k = 5;         // We want the 5th smallest element in the combined array


        long result =findKthEleApproch2(nums1 , nums2 , k) ;   // Call the method1,

        // Output the result
       System.out.println("The " + k + "-th smallest element in the merged sorted a= "+ result);
    }
}