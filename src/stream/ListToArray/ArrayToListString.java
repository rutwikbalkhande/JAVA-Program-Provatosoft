package stream.ListToArray;

import java.util.Arrays;
import java.util.List;

public class ArrayToListString {
    public static void main(String[] args) {

        String arr[]= {"Ram", "Shyam", "Amit"};
        List<String> ls= Arrays.asList(arr);

        System.out.println(ls);
    }
}
