package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SecondLagestEle {
    //find 2nd larget Element Array use two method

    static void m1(int arr[]){

        Arrays.sort(arr);
        System.out.println("m1 2nd largest ele: "+arr[arr.length-2]);

    }
    public static void m2(int arr[]){

        TreeSet<Integer> ts=new TreeSet<>();
       int i=0;
                                    //  for(int i=0;i<arr.length;i++){
            while(i<arr.length)
            {
                ts.add(arr[i]);
                i++;
        }
        System.out.println("m2 treeset(first): "+ ts.first());
    }

    static void m3(int arr[]){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        System.out.println("m3 list 3rd index value: "+list);
        System.out.println(list.get(2));
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,6,9,4,6,5,8};

        System.out.println(Arrays.toString(arr));

         m1(arr);
         m2(arr);
         m3(arr);
    }
}
