package array;

import java.sql.Array;
import java.util.*;

public class a {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 8, 9};
        int target = 6;
           int index= -1;
        int low=0;
        int high= arr.length -1;


        while(low < high)
        {
            int mid= low + (high - low)/2;

            if(arr[mid] == target){
                index= mid;
                System.out.println(mid);
                break;
            }
            if(target < arr[mid])
            {
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
    }}