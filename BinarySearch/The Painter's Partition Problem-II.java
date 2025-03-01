class Solution {
    public int minTime(int[] arr, int k) {
        int low = 0, high = 0;

        // Initialize low as max(arr) and high as sum(arr)
        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }

        int ans = high; // Store the minimum max sum

        // Binary search to find the optimal max sum
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canSplit(arr, mid, k)) {  // Use correct function parameters
                ans = mid; // Update answer
                high = mid - 1; // Try for a smaller max sum
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private boolean canSplit(int[] arr, int maxSum, int k) {
        int chunks = 1, currentSum = 0;

        for (int num : arr) {
            if (currentSum + num > maxSum) {
                chunks++;
                currentSum = num;
                if (chunks > k) return false; // More chunks than allowed
            } else {
                currentSum += num;
            }
        }
        return true;
    }
}
