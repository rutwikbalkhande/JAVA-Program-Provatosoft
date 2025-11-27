package stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListIntToMapSqr {

    // in list convert into map? numbers in List take as key and generate sqyuare as a value

    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(2, 4, 10);

        Map<Integer, Integer> map = num.stream()
                                      .collect(Collectors.toMap(n -> n, n-> (n*n)));

        System.out.println(map);

    }
}
