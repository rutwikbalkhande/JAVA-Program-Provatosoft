package array;

public class MaxSubArray {

    public static void main(String[] args) {

        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int currentSum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){

            currentSum= currentSum + arr[i];
            if(currentSum > max ){
                max= currentSum;

            }
            if(currentSum < 0){
                currentSum=0;
            }

        }
        System.out.println(max);

    }
}
