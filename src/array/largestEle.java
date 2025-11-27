package array;

import java.util.Arrays;

public class largestEle {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 99, 56, 72};
        int max1=0;
        int max2=0;
        int max;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1; j<arr.length;j++)
            {
               if(arr[i] > arr[j]){
                   max1 = arr[i];
                   arr[i] =arr[j];
                   arr[j]= max1;
                }
            }

        }
        System.out.println(max1);
        System.out.println(Arrays.toString(arr));
    }
}
