package com.provatosoft.assignment;

import java.util.Arrays;

public class SelectionSort {
//24. Write a java program to implement selection sort in java.

    public static void main(String[] args) {

        int arr[] = {8, 7, 4, 1, 2, 3, 6};
        int length = arr.length;

                for(int i=0; i<length; i++)
                {
                    int min=i , temp=0;
                    for(int j=i+1; j<length; j++)
                    {
                        if(arr[j] < arr[min])
                        {
                             min = j;
                        }
                    }
                    temp=arr[i];
                    arr[i]= arr[min];
                    arr[min]=temp;
                }
                System.out.print("original array: "+ Arrays.toString(arr) + " ");
               System.out.print("\n selection sort:");

                    for(int i=0; i<length;i++)
                    {
                        System.out.print(arr[i] + " ");
                    }
    }
}
