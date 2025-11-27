package stream.ListToArray;

import java.util.Arrays;
import java.util.List;

public class ListToArrayInt {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

          int arr[] = numbers.stream().mapToInt(Integer::intValue).toArray();

          //    int arr[] = numbers.stream().mapToInt(e->e.intValue()).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
