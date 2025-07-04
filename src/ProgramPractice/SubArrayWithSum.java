package ProgramPractice;

public class SubArrayWithSum {
  // Q. find a continuous subarray in a given array of positive integers
    //input: int[] arr = { 1, 2,  7, 5 ,3};        output: Subarray found from index 0 to 3
    // check subarray for  targetSum = 15;            // time complexity :  O(n)

    public static void main(String[] args) {

        int[] arr = { 1, 2,  7, 5 ,3};
        int targetSum = 15;
        findSubarray(arr, targetSum);
    }
    public static void findSubarray(int[] arr, int targetSum) {
        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {   //We move through the array using a pointer called end.
            sum =  sum + arr[end];                           //Each time, we add the current number (arr[end]) to the sum.

            while (sum > targetSum && start < end) {     //if sum becomes too big, we remove numbers from the left side (start)
                    sum = sum - arr[start];
                    start++;
               }
            // Check for match
            if (sum == targetSum) {                       //If the current sum matches the target, we found the correct window.
                System.out.println("Subarray found from index " + start + " to " + end);
                return;
            }
        }
        System.out.println("No subarray found with given sum ");
    }
}
