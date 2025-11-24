package stream.filter;

import java.util.Arrays;
import java.util.List;

public class filterNumber {
    public static void main(String[] args) {

      int arr[]={1,25,8,10,14};
       /*  ArrayList<Integer> result= new ArrayList(Arrays.asList(1,2.5,8,10,14));

for(int i : arr){
    if(i %2==0)
    {
        System.out.println(i);
    }
}        */
        List<Integer> result = Arrays.stream(arr).boxed().toList();
        List<Integer> rs= result.stream().filter(i -> (i%2 == 0)).toList();
        System.out.println(rs);


    }
}
