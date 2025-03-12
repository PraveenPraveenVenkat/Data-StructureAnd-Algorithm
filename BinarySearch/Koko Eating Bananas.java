import java.util.Arrays;

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = Arrays.stream(piles).max().getAsInt();
        int res = e;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            long val = check(piles, mid);

            if (val <= h) { 
                res = mid;  
                e = mid - 1; 
            } else {  
                s = mid + 1; 
            }
        }
        return res;
    }

    public long check(int[] piles, int k) {
        long count = 0;
        for (int val : piles) {
            count += (long) Math.ceil((double) val / k);
        }
        return count;
    }
}