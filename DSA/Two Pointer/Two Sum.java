//! LeetCode 1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
       // twoPointerApproach(nums,target);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int currentIndex = target - nums[i];
            if (map.containsKey(currentIndex)) {
                return new int[] { map.get(currentIndex), i };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] { -1, -1 };

    }
    //* Using Two Pointer Approach (works only for sorted array)
    // private static void twoPointerApproach(int[] nums, int target){
    //         int left =0, right =nums.length-1;
    //         while(left<=right){
    //             int currentElement= nums[left]+nums[right];
    //             if(currentElement == target){
    //                 System.out.println("Current Element "+ nums[left]+ " "+ nums[right]);
    //                 return;
    //             }
    //             else if (currentElement > target){
    //                 right--;

    //             }else{
    //             left++;
    //             }
               
    //         }
    // }
}