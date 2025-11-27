package stream.ListToArray;

import java.util.Arrays;
import java.util.List;

public class ArrayToListInt {

    public static void main(String[] args) {
        int arr[]={1,2,5,4,3,8,9};

        List<Integer> ls= Arrays.stream(arr).boxed().toList();
        System.out.println(ls);
    }
}
