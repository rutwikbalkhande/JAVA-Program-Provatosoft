package com.provatosoft.assignment;

import java.util.Arrays;

public class MovesZerosToEnd {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        int index=0;
        for(int num : arr){
            if(num !=0 ){
                arr[index]=num;
                index++;
            }
        }
        while(index < arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
