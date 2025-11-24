package array;

public class largestEle {
    public static void main(String[] args) {
        int[] arr = {10, 25, 3, 99, 56, 72};
        int max=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i] > max){

                max2=max;
                max=arr[i];

            }
        }
        System.out.println(max2);
    }
}
