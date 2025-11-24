package stream.filter;

import java.util.Arrays;
import java.util.List;

public class EvenOddStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Even Stream
      List<Integer> l=  list.stream().filter(i->i%2==0).toList();
        System.out.println("Even: "+ l);

        //odd Stream
        List<Integer>l2= list.stream().filter(i-> i%2 !=0).toList();
        System.out.println("Odd: "+ l2);

    }
}
