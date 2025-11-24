package com.provatosoft.assignment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class StringOccuranceCount {
    //16. Write a java program to count occurrences of each character in String in
    //input :  str="Java Hungry";
    // output : character occurance: { =1, a=2, r=1, u=1, v=1, g=1, H=1, y=1, J=1, n=1}

    public static void main(String[] args) {

         String str="Java Hungry";
/*
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
*/
        List<Integer> list= Arrays.asList( 1 ,1,2,2,2,5,5,4);

        Map<Integer, Integer> map= new HashMap<>();

        for(int c: list)
        {
            if(map.containsKey(c)){

                map.put(c, map.get(c)+ 1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
