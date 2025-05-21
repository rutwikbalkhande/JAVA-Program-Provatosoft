package com.provatosoft.assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToArrayList {
//31. Write a java program to convert HashSet to ArrayList(List) in java.

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("rutwik");
        hashSet.add("vishvajeet");
        hashSet.add("ram");
        hashSet.add("kanha");
        hashSet.add("shubham");

        System.out.println(" Hashset: " + hashSet);

         List < String > arrayList = hashSet.stream().toList();

         //or method
       // ArrayList<String> arrayList= new ArrayList<>(hashSet);

        System.out.println("hashSet to ArrayList Convert StreamApi: " );
        System.out.println(arrayList);
    }
}
