package stream.distinct;

import java.util.List;

public class Name {

    public static void main(String[] args) {

        List<String> names = List.of("Amit", "Raj", "Amit", "Sita");

        List<String> unique = names.stream()
                .distinct()
                .toList();

        //Remove dublicate After converting lowercase
        List<String> ls= names.stream()
                            .map(String::toLowerCase)
                             .distinct().toList();

        System.out.println(unique);
        System.out.println(ls);
    }
}
