package com.provatosoft.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListReverseString {
/// 27. Write a java program reverse an ArrayList in java? ArrayList Before Reverse : ["Apple, Amazon, Facebook, Google, IBM,
/// Tesla]

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Apple", "Amazon", "Facebook", "Google", "IBM", "Tesla"));

        System.out.println("list before Reverse : " + list);

        Collections.reverse(list);

        System.out.print("list After reverse");
        System.out.println(list);


    }
}
