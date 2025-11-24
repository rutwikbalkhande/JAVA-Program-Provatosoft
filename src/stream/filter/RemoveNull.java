package stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNull {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Amit", null, "Raj", null);
        List<String> name= names.stream()
                .filter(Objects::nonNull).filter(e->e.contains("@"))
                .toList();
        System.out.println(name);
    }
}
