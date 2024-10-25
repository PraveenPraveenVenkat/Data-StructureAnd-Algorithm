

class Solution {
    public long trappingWater(int arr[]) {
        int len = arr.length;
        if (len == 0) return 0; // Handle edge case of empty array

        long[] left = new long[len];
        left[0] = arr[0];
        for (int i = 1; i < len; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }

        long[] right = new long[len];
        right[len - 1] = arr[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i + 1]);
        }

        long water = 0;
        for (int i = 0; i < len; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }

        return water;
    }
}




// class Solution {
//     public long trappingWater(int arr[]) {
//         // code here
        
//          int len = height.length;
//         if (len == 0) return 0; // Handle edge case of empty array

//         long[] left = new long[len];
//         left[0] = height[0];
//         for (int i = 1; i < len; i++) {
//             left[i] = Math.max(height[i], left[i - 1]);
//         }

//         long[] right = new long[len];
//         right[len - 1] = height[len - 1];
//         for (int i = len - 2; i >= 0; i--) {
//             right[i] = Math.max(height[i], right[i + 1]);
//         }

//         long water = 0;
//         for (int i = 0; i < len; i++) {
//             water += Math.min(left[i], right[i]) - height[i];
//         }

//         return water;

//      }
// }