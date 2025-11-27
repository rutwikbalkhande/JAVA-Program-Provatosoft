package stream.map;

import java.util.List;

public class Map {
    // one input -> one Output

    public static void main(String[] args) {

        List<String> list= List.of("Amit", "Raj");

         List<String> names= list.stream().map(e -> e.toUpperCase()).toList();

        System.out.println(names);
    }
}
