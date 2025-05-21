package com.provatosoft.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToStringArray {

    // 32. Write a java program to convert ArrayList to String array in java.

    void method1()
    {
        ArrayList<String> arrayList=new ArrayList();

        arrayList.add("red");
        arrayList.add("green");
        arrayList.add("white");
        arrayList.add("black");
        arrayList.add("yellow");

        System.out.println("original arrayList :" + arrayList);

        String arr[] = arrayList.toArray(new String[0]);        //convert list to String Array

        System.out.println("convering string array: "+ Arrays.toString(arr));

    }

    void method2()
    {
        System.out.println("....using stream api....");

        List<String> list = Arrays.asList("red", "white", "black", "green", "yellow");

          String arr[] = list.stream().toArray( String[] :: new );

        System.out.println("original list: "+ list);

        System.out.println("after convert list to string Array : "+ Arrays.toString(arr));

    }

    public static void main(String[] args) {

        ArrayListToStringArray as =new ArrayListToStringArray();
        as.method1();
        as.method2();
    }
}
