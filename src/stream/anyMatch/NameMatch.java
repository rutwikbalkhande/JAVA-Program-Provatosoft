package stream.anyMatch;

import java.util.List;

public class NameMatch {

    public static void main(String[] args) {
        List<String> names = List.of("Amit", "Sita", "Raj");

       boolean found = names.stream().anyMatch(n->n.equals("Raj"));

        System.out.println(found);
    }
}
