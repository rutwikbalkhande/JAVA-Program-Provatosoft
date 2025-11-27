package stream.sort;

import java.util.List;

public class NuberSort {
    public static void main(String[] args) {

        List<Integer> nums = List.of(5, 1, 3, 2);

        List<Integer> ls= nums.stream().sorted().toList();
        System.out.println(ls);
    }
}
