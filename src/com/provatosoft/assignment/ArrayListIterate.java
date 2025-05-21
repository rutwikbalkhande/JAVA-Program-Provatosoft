package com.provatosoft.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListIterate {
    //29. Write a java program to iterate over ArrayList in java using for loop, for each loop, While loop, Iterator and Collection's stream() util .


    ArrayList<Integer> list= new ArrayList(Arrays.asList( 1,5,3,8,1,5,5,3,22,77,11 ));

    void method1()
    {       //iterate using for Loop

        System.out.println("iterate using for Loop.....");

        for(int i=0; i<list.size(); i++ )
        {
            System.out.print( list.get(i) + " ");
        }
    }

    void method2()
    {      // iterate using forEach Loop
        System.out.println(" \n forEach loop:..... ");

          for(int value : list)
          {
              System.out.print( value + " ");
          }
    }

    void method3()
    {
        System.out.println("\n while loop:....... ");

        int index=0;

        while(index < list.size())
        {
            System.out.print( list.get(index) + " ");
            index++;
        }
    }

    void method4()
    {
        System.out.println(" \n using iterator.....  ");

        Iterator <Integer> iterator = list.iterator();

        while(iterator.hasNext())
        {
            System.out.print( iterator.next() + " ");
        }
    }

    void method5()
    {
        System.out.println(" \n using stream API.....");
       List<Integer> listStream = list.stream().sorted().toList();

        System.out.print(listStream + " ");
    }


    public static void main(String[] args) {

        ArrayListIterate al= new ArrayListIterate();

        al.method1();
        al.method2();
        al.method3();
        al.method4();
        al.method5();

    }
}
