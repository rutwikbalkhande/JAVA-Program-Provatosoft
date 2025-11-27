package stream.ListToArray;

import java.util.Arrays;
import java.util.List;

public class DoubleToArray {

    public static void main(String[] args) {

        List<Double> nums = Arrays.asList(2.5, 4.7, 10.1);

       double arr[] =  nums.stream().mapToDouble(Double::doubleValue).toArray();
        System.out.println(Arrays.toString(arr));
    }
}
