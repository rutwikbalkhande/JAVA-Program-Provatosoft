package com.provatosoft.assignment;

public class PalindromeString {

 //   19. Write a java program to check whether input string is palindrome of the
  //  given string or not.

    public static void main(String[] args) {

        String name="aaa";
        int len=name.length();

        String rev="";
        StringBuffer sb= new StringBuffer();

        sb.append(name);
        sb.reverse();

       rev=sb.toString();
        System.out.println("name: "+name);
        System.out.println("reverse name: " +rev);

         if(name.equals(rev))
         {
             System.out.println("name is Palindrome" + name);
         }
         else{
             System.out.println("name Not palindrome !");
         }

    }

}
