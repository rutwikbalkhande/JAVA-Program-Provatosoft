package com.provatosoft.assignment;

import java.util.Arrays;
import java.util.HashSet;

public class HashsetToArray {
//39. Write a java program to convert HashSet to Array in java.

    void method1()
    {
        System.out.println("Integer store HasSet to Array");

        HashSet<Integer> hs =new HashSet<>(Arrays.asList(10,20,30,40,50,60));

        System.out.println("hashSet recode : "+ hs);

        Integer numberArray[]= hs.toArray( new Integer[0]);

        System.out.println("convert to Array: "+ Arrays.toString (numberArray));

    }

  void  method2()
    {
        System.out.println("string add in Array");

        HashSet<String> hs =new HashSet<>(Arrays.asList("ram", "sham", "rutwik", "parth", "sahil"));

       String arr[]=hs.toArray(new String[0]);

    /*    String arr[]=new String[hs.size()];          //Another Way
        hs.toArray();   */

        System.out.println("add into Arraty: "+ Arrays.toString(arr));
    }

    public static void main(String[] args) {

        HashsetToArray h=new HashsetToArray();
        h.method1();
        h.method2();



    }
}
