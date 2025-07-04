package array;

import java.util.HashSet;

public class FirstRepeatingNumber {
    public static void main(String[] args) {


        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        int index = 0;

        HashSet<Integer> num = new HashSet<>();
        Integer firstRepeateNo = null;

        while(index < arr.length){
            if(!num.add(arr[index])) {
                firstRepeateNo=arr[index];
                break;
            }
            index++;
        }
        if (firstRepeateNo != null) {
            System.out.println("First repeating No. : " + firstRepeateNo);
        } else {
            System.out.println("No repeating No.found.");
        }
    }
}
