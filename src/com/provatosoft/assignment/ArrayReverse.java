package com.provatosoft.assignment;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayReverse {

    //26.  Write a java program reverse an int Array in java?

             Integer arr[] = {3, 8, 5, 7, 4};        //   Output : {4, 7, 5, 8, 3}

              Integer arr1[] = {10, 54, 23, 89, 97, 2};    //  Output  : {2, 97, 89, 23, 54, 10}


    // Method 1 Reverse order using Collections.reverse()
    void method1() {
        System.out.println("method1 : Using Collections.reverse()" + Arrays.toString(arr));

        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(list);

        System.out.println("Reversed array: " + list);
    }

    void method2()
    {
        int t;
        System.out.println("method2 : array reverse for loop: ");
        for(int i=arr.length-1; i>=0;i--)
        {
            t=arr[i];
            System.out.print (t + " ");
        }

    }

    void method3()
    {
        Arrays.sort(arr1);
        System.out.println(" \n method3 : using sort method 3");

        for(int sorted : arr1)
        {
            System.out.print(sorted + " ");
        }
    }

    void method4() {

        System.out.println("\n method 4: Using Stream API with TreeSet (sorted descending, no duplic)");
        System.out.println("original arr1 " + Arrays.toString(arr1));

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr1));

        TreeSet<Integer> num = list.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<Integer>(Comparator.reverseOrder())));


        System.out.println("Sorted desc TreeSet: " + num);
    }

    public static void main(String[] args) {

        ArrayReverse ar=new ArrayReverse();
        ar.method1();
        ar.method2();
        ar.method3();
        ar.method4();
    }
    }
