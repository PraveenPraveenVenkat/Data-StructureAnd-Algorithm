class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1, high = stalls[n - 1] - stalls[0], ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlaceCows(stalls, mid, k)) {
                ans = mid; // Update answer
                low = mid + 1; // Try for a larger minimum distance
            } else {
                high = mid - 1; // Reduce search space
            }
        }
        return ans;
    }

    private static boolean canPlaceCows(int[] stalls, int minDist, int cows) {
        int count = 1, lastPlaced = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPlaced >= minDist) {
                count++;
                lastPlaced = stalls[i];

                if (count == cows) return true; // Early exit
            }
        }
        return false;
    }
}