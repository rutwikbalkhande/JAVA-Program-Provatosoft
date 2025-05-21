package com.provatosoft.assignment;

//20. Write  a java program to convert Lowercase to Uppercase and vice versa
//in a given String.

public class LowerCaseToUpperCase {

    String name="Rutwik";
    char charArray[]=name.toCharArray();

     char nameUpperCase;
     char nameLowercase;

    void upperCaseName()
    {
        System.out.print( name + " :Convert uppercase: ");

        for(char i=0;i<charArray.length;i++)
        {
            nameUpperCase=  Character.toUpperCase(charArray[i]);

            System.out.print(  nameUpperCase );
        }

    }

    void lowerCasename() {
        System.out.println(" ");
        System.out.println( name + " :Convert Lowercase: ");

        for (char i = 0; i < charArray.length; i++) {
                   nameLowercase = Character.toLowerCase(charArray[i]);

                  System.out.print(nameLowercase);
        }
    }

    public static void main(String[] args) {

        LowerCaseToUpperCase up=new LowerCaseToUpperCase();
        up.upperCaseName();
        up.lowerCasename();

    }
}
