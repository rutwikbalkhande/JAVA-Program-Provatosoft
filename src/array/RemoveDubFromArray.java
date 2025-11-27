package array;

import java.util.Arrays;

public class RemoveDubFromArray {

    public  int remove(int arr[])
    {

        int j = 0;  // j = index of last unique element

        for (int i = 1; i < arr.length; i++) {
            // If current element is different from last unique element
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j + 1; // number of unique elements
    }


    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,3,3,4};

        RemoveDubFromArray r = new RemoveDubFromArray();
        int uniqueCount = r.remove(arr);

        // Print only unique elements
        System.out.println(Arrays.toString(Arrays.copyOf(arr, uniqueCount)));
    }
}
