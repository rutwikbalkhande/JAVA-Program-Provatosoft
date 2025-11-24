package array;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingNumber {
    //Q. Find First Repeating Element in the array {only first }
    //input :  int arr[] = {10, 5, 3, 4, 3, 5, 6,10};
    //output : 3  { because first 3 is repeate  index =4}
    //time complexity : 0(n)

    public static void main(String[] args) {

        int arr[] = {10, 5, 3, 4, 3, 5, 6,10};

        Set<Integer> hs = new HashSet<>();     //HashSet is checking if element already exists.
        Integer firstRepeateNo = null;

        for(int a : arr){
            if( hs.contains(a) ){
                firstRepeateNo=a;
                break;
            }
            else{
                hs.add(a);
            } }
        if(firstRepeateNo != null){
            System.out.println("repeateNo: "+ firstRepeateNo);
        }
        else{
            System.out.println("no repeate No");
        }





    }
}
