package com.provatosoft.assignment;

import java.util.Arrays;

public class WordsInStringStreamApi {

    public static void main(String[] args) {

        String input= "Hello im rutwik";

      long wordCount=  Arrays.stream(input.trim().split("\\s+")).filter(word ->!word.isEmpty()).count();

        System.out.println("no. of word: "+ wordCount);

    }

}
