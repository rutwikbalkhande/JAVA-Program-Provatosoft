package stream.groupinBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class oddEven {

    // find odd even number // {Odd=[1, 3, 5], Even=[2, 4, 6]}
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        Map<String,List<Integer> > ls=list.stream().collect(Collectors.groupingBy(n-> n%2 == 0? "Even" : "Odd"));

        System.out.println(ls);
    }
}
