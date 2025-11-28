package stream.toMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NoToSquare {
    // we have Number as a key & generate square & store as value into the map

    public static void main(String[] args) {

        List<Integer> ls= List.of(1,2,3,4,5);

        Map<Integer, Integer> map= ls.stream().collect(Collectors.toMap
                                                     (n->n, n-> (n*n) ));

        System.out.println(map);
    }

}
