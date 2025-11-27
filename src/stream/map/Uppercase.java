package stream.map;

import java.util.Arrays;
import java.util.List;

public class Uppercase {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","c","d");

        List<String> result1= list.stream().map(e-> e.toUpperCase()).toList();

        List<String> result2= list.stream().map(String::toUpperCase).toList();

        System.out.println("result 1 : " + result1);
        System.out.println("result 2 : " +result2);
    }
}
