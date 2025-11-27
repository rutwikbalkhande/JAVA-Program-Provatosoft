package stream.ListToArray;

import java.util.Arrays;
import java.util.List;

public class LongToArray {

    public static void main(String[] args) {

        List<Long> numbers = Arrays.asList(10L, 20L, 30L);

      long arr[] =  numbers.stream().mapToLong(Long :: longValue).toArray();

        System.out.println(Arrays.toString(arr));

    }
}
