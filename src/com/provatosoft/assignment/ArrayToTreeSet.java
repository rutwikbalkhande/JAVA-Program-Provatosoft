package com.provatosoft.assignment;

import java.util.Arrays;
import java.util.TreeSet;

public class ArrayToTreeSet {
//38. Write a java program to convert Array to TreeSet in java.

    public static void main(String[] args) {

        String arr[]={ "a" , "c","e","b","d" };

        TreeSet<String> treeSet = new TreeSet<>(Arrays.asList(arr));


        System.out.println("array values :" + Arrays.toString(arr));

        System.out.println(" converting into Treeset "+ treeSet);

      /*  for(String values: arr)
        {
            System.out.println( values);
        }

       */
    }
}
