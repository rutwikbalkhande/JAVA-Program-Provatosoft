package stream.toMap;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexbyName {
    // we hjave name list store names with index. index = key, value= name;

    public static void main(String[] args) {

        List<String> name = List.of("Amit", "Raj", "Sita");

        Map<Integer, String> map= IntStream.range(0, name.toArray().length)
                .boxed()
                .collect(Collectors.toMap(i->i, name::get)) ;

        System.out.println(map);
    }
}
