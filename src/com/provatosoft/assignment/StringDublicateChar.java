package com.provatosoft.assignment;

public class StringDublicateChar {
//44. Write a Java Program to find the duplicate characters in a string.
    public static void main(String[] args) {

        String name  =  "Ruttwik" ;
        String str=name.toLowerCase();
        boolean a=false;

        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1 ;j<str.length();j++)
            {
                if ( str.charAt(i) == str.charAt(j))
                {
                    System.out.println("name= "+ str);
                    System.out.print("Dublicate character: "+ str.charAt(i) );
                    a=true;
                }

            }
        }
        if (a==true)
        {
            System.out.println();
        }
        else{
            System.out.println(" Dublicate character not found !");
        }

    }
}
