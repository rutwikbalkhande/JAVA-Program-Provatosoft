package com.provatosoft.assignment;

public class UniqueStringOrNot {
//7. Write a java program to find out if the given String has all Unique Characters.


    public static void main(String[] args) {

        String name="Ruttwik";
      //  String name="abcdefg";

        boolean isUnique=false;


        for( int i=0;i<name.length();i++)
        {
            for(int j=i+1; j<name.length();j++)
            {
                if(name.charAt(i) == name.charAt(j)) {

                    System.out.println("repeate character : " + name.charAt(i));
                    isUnique = true;
                    break;

                }
            }
        }
        if(isUnique==true)
        {
            System.out.println("String is not unique");
        }
        else{
            System.out.println("Repeated character not available");
        }
    }
}
