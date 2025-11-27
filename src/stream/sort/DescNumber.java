package stream.sort;

import java.util.List;

public class DescNumber {

    // sort number descending order
    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 1, 3, 2);

   List<Integer> ls = nums.stream()
                .sorted((a, b) -> b - a)
                .toList();

        System.out.println(ls);
    }
}
