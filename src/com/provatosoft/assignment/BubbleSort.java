package com.provatosoft.assignment;

import java.util.Arrays;

public class BubbleSort {
//25. Write a java program to implement Bubble sort in java.

    public static void main(String[] args) {

        int arr[] ={8,7,4,1,2,3,6};
        int length=arr.length;

        System.out.print("original array: " + Arrays.toString(arr));

// main loop
        for(int i=0; i<arr.length; i++)
        {
             for(int j=1; j<length-i; j++)
             {
                 if(arr[j-1] > arr[j])
                 {
                     //swapping
                     int temp= arr[j];
                     arr[j]=arr[j-1];
                     arr[j-1]= temp;

                 }
             }//8 7
        }
              System.out.print("\n sorted array :");
             for(int i= 0; i<length; i++)
             {
                 System.out.print(arr[i] + " ");
             }

    }
}
