package com.provatosoft.assignment;

import java.util.HashMap;
import java.util.TreeMap;

public class MapSortKey {
//36. Write a java program to sort HashMap in java by keys and values? Sort by Keys example

    public static void main(String[] args) {

        HashMap<Integer, String> map =new HashMap<>();

        map.put(33, "Z");
        map.put(99, "I");
        map.put(22, "A");
        map.put(55, "B");
        map.put(88, "X");
        map.put(44,"M");

        System.out.println("map record: "+ map);

        TreeMap<Integer , String> treeMap = new TreeMap<>(map);

        System.out.println("after sorting Treemap : " );
        System.out.println(treeMap);

    }
}
