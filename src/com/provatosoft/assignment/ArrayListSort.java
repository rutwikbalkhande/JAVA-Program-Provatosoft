package com.provatosoft.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(5,20,4,3,2,7,6,9,8));

        List<Integer> list= arrayList.stream().sorted().toList();

        System.out.println("original Array: "+ arrayList);
        System.out.println("ArrayList Sort: " + list);
    }
}
