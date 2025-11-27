package array;

import java.util.Arrays;

public class Merge2Array {

    // merge two array without sort and collection

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 3, 5, 7, 7};
        int[] arr2 = {1, 2, 4, 5, 6, 6, 8};
        int len1= arr1.length;
        int len2= arr2.length;

        int[] result= new int[len1 + len2];

        int i=0, j=0, index=0;

        while(i < len1 && j < len2)
        {
            if (arr1[i] <= arr2[j]) {

                result[index] = arr1[i];
                i++;
                index++;
            }
            else{
                result[index] = arr2[j];
                index++;
                j++;
            }
        }
        while(i < len1){
            result[index++] = arr1[i++];
        }
        while(j< len2){
            result[index++] =arr2[j++];
        }
        System.out.println(Arrays.toString(result));

    }
}