package com.provatosoft.assignment;

public class ReverseString {

    void reverse()
    {
        String name= "Rutwik";
        int len=name.length();
        String rev="";

        for(int i=len-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println(rev);
    }
    public static void main(String[] args) {

        ReverseString rs=new ReverseString();
        rs.reverse();

    }
}
