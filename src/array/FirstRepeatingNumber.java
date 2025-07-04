package array;

import java.util.HashSet;

public class FirstRepeatingNumber {
    //Q. Find First Repeating Element in the array {only first }
    //input :  int arr[] = {10, 5, 3, 4, 3, 5, 6,10};
    //output : 3  { because first 3 is repeate  index =4}
    //time complexity : 0(n)

    public static void main(String[] args) {

        int arr[] = {10, 5, 3, 4, 3, 5, 6,10};
        int index = 0;

        HashSet<Integer> num = new HashSet<>();     //HashSet is checking if element already exists.

        Integer firstRepeateNo = null;

        while(index < arr.length){
            if(!num.add(arr[index])) {         //If arr[index] already in set, it fails to add, and found the first repeating number.
                firstRepeateNo=arr[index];
                break;                        //break after repeat found
            }
            index++;
        }
            System.out.println("hashset" + num);

        if (firstRepeateNo != null) {               //conditiuon check Reper=ateNo not null then print no. & index
            System.out.println("First repeating No.: " + firstRepeateNo + " at index: " + index);
        }
        else {
            System.out.println("No repeating No.found.");
        }
    }
}
