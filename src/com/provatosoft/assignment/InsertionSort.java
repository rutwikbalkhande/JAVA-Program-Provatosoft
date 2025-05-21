package com.provatosoft.assignment;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class InsertionSort {
// 23. Write a java program to implement Insertion sort in java.

    void method1()
    {
        List<Integer> number = Arrays.asList(5,3,8,2,1,4,7,6,4);

            TreeSet<Integer> sortset =
                      number.stream().sorted().collect(Collectors.toCollection(TreeSet :: new));

        System.out.println("Sorted set Dublicate not allow : " + sortset);
    }

    void method2()
    {
           List<Integer> numbers = Arrays.asList(5,3,8,2,1,4,7,6,4);

                 List <Integer> listSort =
                                        numbers.stream().sorted().toList();

        System.out.println("List sort allow dublicate " + listSort);
    }

    void method3()
    {
           int arr[]={5 ,3,8,2,1,4,7,6};

           Arrays.sort(arr);
        System.out.println( " using Arrays.sort method :" + Arrays.toString(arr));
    }

    public static void main(String[] args) {

        InsertionSort is=new InsertionSort();

        is.method1();
        is.method2();
        is.method3();



    }
}
