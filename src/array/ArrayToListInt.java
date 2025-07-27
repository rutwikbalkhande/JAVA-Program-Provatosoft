package array;

import java.util.Arrays;
import java.util.List;

public class ArrayToListInt {
    public static void main(String[] args) {

        m1();
        m2();
    }
    public static void m1 (){
        int arr[]={1,5,3,4,6,8,9,4,7,6};

         List<Integer> list= Arrays.stream(arr).boxed().toList();
         System.out.println("int Array stream: " +list);

     }

     static void m2(){
         Integer arr[]={1,5,3,4,6,8,9,4,7,6};

         List<Integer> list=Arrays.asList(arr);
         System.out.println("m2: "+list);
     }
}
