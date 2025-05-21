package com.provatosoft.assignment;

public class ArrayCommonNo {

    public static void main(String[] args) {

        int array1[] = {1, 4, 7, 9, 2};

        int array2[] = {1, 7, 3, 4, 5};

        System.out.println("common number in array");

        for(int i=0;i<array1.length;i++)
        {
            for(int j=0;j<array2.length ; j++)
            {
                if(array1[i] == array2[j])
                {
                    System.out.println(array1[i] + "");
                }
            }
        }





    }
}
/*
        int arr[] = {1, 2, 3, 4, 2, 5, 3};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }}}}
*/