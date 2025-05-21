package com.provatosoft.assignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {
//30. Write a java program to convert LinkedList to ArrayList in java

    public static void main(String[] args) {

        LinkedList<String> linkedList=new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("banana");
        linkedList.add("grapse");
        linkedList.add("mango");

        System.out.println("Linkedlist :" + linkedList);

        ArrayList<String> arrayList =new ArrayList<>(linkedList);

        System.out.println("linkedlist to ArrayList Convert " );

        System.out.println(arrayList);


    }
}
