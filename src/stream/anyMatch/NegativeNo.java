package stream.anyMatch;

import java.util.List;

public class NegativeNo {

    public static void main(String[] args) {

        List<Integer> nums = List.of(2, 5, 8, 12);

        boolean hasNegative = nums.stream()
                .anyMatch(n -> n < 0);

        System.out.println(hasNegative);
    }
}
