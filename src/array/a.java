package array;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class a {
    public static void main(String[] args) {

        List<Integer> ls= new ArrayList(Arrays.asList(2,4,5));

       Map<Integer , Integer> list= ls.stream().collect(Collectors.toMap(n-> n , n-> (n*n)));

        System.out.println(list);


    }
}