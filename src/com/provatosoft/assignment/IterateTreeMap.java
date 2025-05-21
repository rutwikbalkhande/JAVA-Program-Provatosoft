package com.provatosoft.assignment;

import java.util.TreeMap;
import java.util.TreeSet;


public class IterateTreeMap {
//41.  Write a java program to iterate over TreeMap in java.

    public static void main(String[] args) {

        TreeMap<Integer , String > map= new TreeMap();

        map.put(1,"rutwik");
        map.put(2,"prajwal");
        map.put(3,"vitthal");
        map.put(4,"parth");
        map.put(5,"shubham");

        for(Integer key : map.keySet())             //map.keySet() : gives all keys from treeMap
        {
            System.out.println("key:" + key + " value= "+ map.get(key));    //map.get(key) : give value stored for the key in the map
        }

    }
}
