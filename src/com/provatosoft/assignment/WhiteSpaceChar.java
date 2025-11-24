package com.provatosoft.assignment;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class WhiteSpaceChar {
    //9. Write a java program to remove all the white-spaces in the String.

    public static void main(String[] args) {

        String input = "Hello world";

        String noSpace= input.replaceAll("\\s+","");

        System.out.println(noSpace);


    }
}
