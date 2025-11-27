package stream.sort;

import java.util.Comparator;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {

        List<String> names = List.of("Sita", "Amit", "Raj");

        List<String> ls= names.stream().sorted().toList();

        //Sorting Reverse
        List<String> sortedDesc = names.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(ls);
        System.out.println(sortedDesc);
    }
}
