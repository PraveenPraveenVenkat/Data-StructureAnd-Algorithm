// User function Template for Java
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
        
        
         int sum = arr[0];
        int maxSum = arr[0];
        
        for(int i = 1; i <arr.length; i++){
            sum = Math.max(sum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}
