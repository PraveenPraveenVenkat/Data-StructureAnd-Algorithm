//! LeeetCode 42. Trapping Rain Water
//* TC O(1)
//* SC O(N)
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int right = n-1, left = 0, maxLeft = 0, maxRight = 0, result = 0;

        while (left <= right) {
            if (height[left] <= height[right]) {

                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    result += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    result += maxRight - height[right];
                }
                right--;
            }

        }
        return result;
    }
}
