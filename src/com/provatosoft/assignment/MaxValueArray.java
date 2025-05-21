package com.provatosoft.assignment;

import java.lang.reflect.Array;
import java.util.*;

public class MaxValueArray {
/* 21. Find the maximum value in Array without using Collection? Suppose there is an array {1,7,91,12,57} , then the answer should be 91
                       as it is the maximum value in the given array.
*/

    Integer arr[]={1,7,91,12,57};

    void method1()
    {
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr) + " :sort Array");

        System.out.println(arr[arr.length-1] + " :larger no. in Array");
    }

    void method2()
    {
        List<Integer> list= new ArrayList<>(Arrays.asList(arr));

        System.out.println("\n using list find max value.. ");

        int max=Collections.max(list);
        int min=Collections.min(list);

        System.out.println("max from list: "+ max);
        System.out.println("min from list: "+ min);
    }

    public static void main(String[] args) {

        MaxValueArray a= new MaxValueArray();
        a.method1();
        a.method2();
    }

}
