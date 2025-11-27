package stream.map;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoTo_Square_Key_Value {

    // we hve numbers store as a key & generate square as a value

    public static void main(String[] args) {

    List<Integer> list =List.of(2,3,4);

         Map<Integer, Integer> map =
                 list.stream().collect(Collectors.toMap(n->n, n->n*n));

        System.out.println(map);
}
}