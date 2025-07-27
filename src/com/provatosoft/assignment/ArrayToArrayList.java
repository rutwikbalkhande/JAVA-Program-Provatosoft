package com.provatosoft.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {

    //33. Write a java program to convert Integer or String Array to ArrayList(List) in java.

    void method1() {

    Integer arr[] = {1, 5, 3, 4, 6, 8, 9, 4, 7, 6};    // data type integer Required

    List<Integer> list = Arrays.asList(arr);
        System.out.println("integer Array: "+list);
}

    void method2()
    {
        String arr[] = { "a" , "b","c","d","e"};

        ArrayList<String> list =new ArrayList<>();

        for(char i=0; i<arr.length; i++)
        {
            list.add(arr[i]);
        }

        for(String arrays : arr)
        {
            System.out.println("Array: " + arrays);
        }
        System.out.println("convert to ArrayList: "+ list);

    }

    void method3()
    {
        System.out.println("method 2.....");

        String fruitArray[] = {"Apple", "Banana", "Orange", "Mango"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(fruitArray));

        System.out.println("original array:" +Arrays.toString(fruitArray));

        System.out.println("convert ArrayLsit: "+ list);
    }

    public static void main(String[] args) {

        ArrayToArrayList al=new ArrayToArrayList();

        al.method1();
        al.method2();
        al.method3();
    }
}
