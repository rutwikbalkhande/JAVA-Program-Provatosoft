package ProgramPractice;

import java.util.Arrays;

public class StringWordCount {

    static String name="hi am rutwik";

    static void approch1()
    {
        long countWord= Arrays.stream(name.trim().split("\\s+"))
                .filter(wordCount->! name.isEmpty()).count();

        System.out.println("Count Word Using Stream: "+ countWord);
    }

    static void approch2()
    {
        String array[] =name.trim().split("\\s+");

        int count=0;
        for(String word: array)
        {
            count++;
        }

        System.out.println("ForEach loop: " + count);
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        approch1();
        approch2();

    }
}
