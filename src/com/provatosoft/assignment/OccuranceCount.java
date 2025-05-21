package com.provatosoft.assignment;

import java.util.HashMap;
import java.util.Map;

public class OccuranceCount {
    //16. Write a java program to count occurrences of each character in String in
    //java. If the String is
    public static void main(String[] args) {

         String str="Java Hungry";

        Map < Character , Integer > charCountMap = new HashMap<>();

        for(char c : str.toCharArray())
        {
            if( charCountMap.containsKey(c) )
            {
                charCountMap.put(c, charCountMap.get(c) +1 );
            }
            else{
                charCountMap.put(c , 1);
            }
        }
        System.out.println("character occurance: "+ charCountMap);
    }
}
