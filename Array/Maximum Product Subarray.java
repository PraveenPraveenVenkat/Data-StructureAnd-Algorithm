class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
            long maxProd = arr[0];
        long minProd = arr[0];
        long result = arr[0];  
        
        int n = arr.length;

     
        for (int i = 1; i < n; i++) {
            // If the current element is negative, we swap maxProd and minProd
            if (arr[i] < 0) {
                long temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }


            maxProd = Math.max(arr[i], maxProd * arr[i]);
            minProd = Math.min(arr[i], minProd * arr[i]);

            result = Math.max(result, maxProd);
        }

        return (int)result;
    }
}