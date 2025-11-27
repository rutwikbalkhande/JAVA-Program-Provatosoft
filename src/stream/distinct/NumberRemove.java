package stream.distinct;

import java.util.List;

public class NumberRemove {

    //Remove Dublicate number use " distinct "

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 2, 3, 4, 4, 5);

        List<Integer> ls=   nums.stream().distinct().toList();

        System.out.println(ls);
    }
}
