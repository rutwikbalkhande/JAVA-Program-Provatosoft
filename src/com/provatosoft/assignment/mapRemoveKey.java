package com.provatosoft.assignment;

import java.util.HashMap;

public class mapRemoveKey {

    //35. Write a java program to remove key value mapping from HashMap?

    public static void main(String[] args) {

        HashMap <Integer, String> map =new HashMap<>();

        map.put(1,"apple");
        map.put(2,"cherry");
        map.put(3,"stoberry");
        map.put(4,"dragon");

        System.out.println("map record: "+ map);

         String removeValue = map.remove(2);

        System.out.println("after Removing key from map: " + removeValue);
        System.out.println(map);
    }
}
