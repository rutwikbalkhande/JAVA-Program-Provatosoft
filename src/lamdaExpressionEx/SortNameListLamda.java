package lamdaExpressionEx;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortNameListLamda {
    //sort name in array-> List provide "Collection.sort" method using lamda expression;
    public static void main(String[] args) {

      String arr[]={"Zara", "Ankit", "Neha", "Ravi"};
      List<String>list=Arrays.asList(arr);
        System.out.println("originaql: "+ list);

      Collections.sort(list,(a,b)->a.compareTo(b));

        System.out.println("After Sort: " +list);

    }
}
