package array;

import javax.management.BadAttributeValueExpException;
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

    public static long findKthEleApproch1(int[] array1, int[] array2,int k) {

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        if (array1.length + array2.length > k) {
          //   throw new IndexOutOfBoundsException("size of k is large than array");
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

    // Approch2

    public static long kthElement(int[] nums1, int[] nums2, int n, int m, int k) {
    // Step 1: Make sure nums1 is the smaller array (for easier binary search)
        if (nums1.length > nums2.length) {
        return kthElement(nums2, nums1, m, n, k); // swap arrays if needed
    }

    int n1 = nums1.length;
    int n2 = nums2.length;

    // Step 2: Set binary search range
    // We can take at least max(0, k - n2) elements from nums1
    // We can take at most min(k, n1) elements from nums1
    int start = Math.max(0, k - n2);
    int end = Math.min(k, n1);

    // Step 3: Binary Search
        while (start <= end) {
        // cut1: how many elements we take from nums1
        int cut1 = start + (end - start) / 2;

        // cut2: remaining elements taken from nums2
        int cut2 = k - cut1;

        // Step 4: Get the boundary elements for both cuts
        // These are the last elements on the left and first elements on the right
        int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
        int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
        int r1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
        int r2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];

        // Step 5: Check if this is a valid partition
        if (l1 <= r2 && l2 <= r1) {
            // If both sides are correctly partitioned,
            // the answer is the maximum of the two left elements
            return Math.max(l1, l2);
        }

        // Step 6: Adjust binary search
        // If l1 is too big, move left
        else if (l1 > r2) {
            end = cut1 - 1;
        }

        // If l2 is too big, move right
        else {
            start = cut1 + 1;
        }
    }
        return 0; // This should never happen for valid input
}

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 6, 7, 9};
        int[] nums2 = {1, 4, 8, 10};

        int k = 5;         // We want the 5th smallest element in the combined array


        long result1 =findKthEleApproch1(nums1 , nums2 , k) ;   // Call the method1,

        // Call the method
        long result2 = kthElement(nums1, nums2, nums1.length, nums2.length, k);

        // Output the result
       System.out.println("Approch1= " + k + "-th smallest element in the merged sorted a= "+ result1);

        System.out.println("Approch2= " + k + "-th smallest element in the merged sorted a= "+ result2);
    }
}