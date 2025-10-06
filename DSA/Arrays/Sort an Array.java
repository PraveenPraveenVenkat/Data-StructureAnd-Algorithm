//! LeetCode 912
//* TC: O(n log n)
//* SC: O(1)
class Solution {
    public int[] sortArray(int[] nums) {
            Arrays.sort(nums);
            return nums;
        }

    }

//* TC: O(n²)
//* SC: O(1)
// class Solution {
//     public int[] sortArray(int[] nums) {
         //* Simple bubble sort
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = 0; j < nums.length - i - 1; j++) {
//                 if (nums[j] > nums[j + 1]) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }
//         return nums;
//     }
// }