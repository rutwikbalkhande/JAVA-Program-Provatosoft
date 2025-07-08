package com.provatosoft.assignment;

import java.util.Arrays;

public class WordsInString {
    //8. Write a Java Program  to Count number of words in the String

    public static void main(String[] args) {

        String str="Hello im rutwik   ";

      String  words[] =  str.trim().split( "\\s+");

        System.out.println(Arrays.toString(words));
      int count=0;
      for(String word : words)
      {
          if(!word.isEmpty())
          {
              count++;
          }
      }
        System.out.println("number of word : "+ count);
    }
}
