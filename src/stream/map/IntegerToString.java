package stream.map;

import java.util.List;

public class IntegerToString {
    // add 10 in each element

    public static void main(String[] args) {

        List<Integer> num = List.of(1, 2, 3, 4);

        List<String> list= num.stream().map(String::valueOf).toList();


      //  List<String> list= num.stream().map(n->n.toString()).toList();

        System.out.println(list);


    }
}
