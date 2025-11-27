package array;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNo {

    public static void main(String[] args) {

        int arr[] = {2, 3, 3, 3, 5, 7, 8, 1};

       Set<Integer> set= Arrays.stream(arr).boxed().collect(Collectors.toSet());

        System.out.println("set: "+ set);

     List<Integer> list=   IntStream.range(1,8)
                .boxed()
                .filter(i-> !set.contains(i))
                .toList();

        System.out.println(list);

    }
}