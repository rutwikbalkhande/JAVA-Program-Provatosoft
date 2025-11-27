package stream.ListToArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ListToArrayString {

    // using stream convert list to Array
    public static void main(String[] args) {

        List<String> list= Arrays.asList("Ram", "Shyam", "Amit");

        String arr[]= list.stream().toArray(String[]::new);

        System.out.println(Arrays.toString(arr));
    }
}
