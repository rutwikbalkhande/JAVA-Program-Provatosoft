package com.provatosoft.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class ArrayListReverseDesc
{
    //34. Write a java program to sort ArrayList in Descending order in java.

    public static void main(String[] args) {

      Integer arr[]= {1,2,3,4,5,6};

        ArrayList<Integer> al= new ArrayList<>(Arrays.asList(arr));

        System.out.println("original list: " + al);


        Collections.reverse(al);

        System.out.println("Reverse List: "+ al);

    }
}
