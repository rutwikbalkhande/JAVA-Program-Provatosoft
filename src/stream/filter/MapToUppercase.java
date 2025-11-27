package stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MapToUppercase {
    public static void main(String[] args) {

        List<String> name= Arrays.asList("ram", "sham", "sita");

        List<String> names= name.stream().map(n-> n.toUpperCase()).toList();
        System.out.println("Convert uppercase: "+ names);


        List<String> list = Arrays.asList("Amit", null, "Raj", null);
        List<String> rs = list.stream().filter(x -> Objects.nonNull(x)).toList();

        // List<String> rs1 = maps.stream().filter(Objects::nonNull ).toList();     // You use :: when you want to pass a method as a function.

        System.out.println(" Remove null : " + rs);
          }
}
