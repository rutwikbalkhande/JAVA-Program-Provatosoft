package array;

import java.util.Arrays;

public class KthSortedArray {

    public static long findKthEleApproch1(int[] array1, int[] array2, int k) {

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        if ( k > array1.length + array2.length ) {
               throw new IndexOutOfBoundsException("size of k is large than array");
        }
        int x = 0, y = 0;
        for (int i = 0; i < array1.length + array2.length; i++) {
            if (array1[x] < array2[y]) {

                System.out.println("x:"+ array1[x] + " Y:"+ array2[y]);
                if (i == k - 1) {
                    return array1[x];
                }
                x++;
            }
            else{
                if (i == k - 1) {
                    return array2[y];
                }
                y++;
            }
        }
        return 0;

    }

    public static void main(String[] args) {

        int num1[]={2, 3, 6, 7, 9};
        int num2[]={1, 4, 8, 10};

        int k= 5;

        long result =findKthEleApproch1(num1,num2,k);

        System.out.println("5th largest element: "+ result);

    }
}
