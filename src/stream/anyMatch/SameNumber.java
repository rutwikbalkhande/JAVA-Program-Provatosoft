package stream.anyMatch;

import java.util.List;

public class SameNumber {

    public static void main(String[] args) {

        List<Integer> nums = List.of(2, 5, 8, 12);

        boolean result = nums.stream()
                .anyMatch(n -> n > 10);

        System.out.println(result);
    }
}
