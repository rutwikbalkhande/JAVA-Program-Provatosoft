package com.provatosoft.assignment;

import java.util.LinkedHashSet;

public class NonRepeatedChar {
    //5. How to find the first non repeated character in the String?
    public static void main(String[] args) {

       String name="rraaj";

        LinkedHashSet<Character> set =new LinkedHashSet<>();


        for(int i=0;i<name.length();i++)
        {

            if (set.contains(name.charAt(i)))           //1st check in set same character available or not
            {
                System.out.println("not unique: " + name.charAt(i));

            }
            else {

                set.add(name.charAt(i));
                System.out.println("dublicate char not available");
            }
        }
        System.out.println(set);

    }
}
