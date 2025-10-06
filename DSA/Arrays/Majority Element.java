//! Leetcode 169
//* TC: O(n log n)
//* SC: O(1)
class Solution {
    public int majorityElement(int[] nums) {
        
       Arrays.sort(nums);
       int n = nums.length;
       return nums [n/2];      

    }
}

//* Hareesh Solution
//* TC: O(n)
//* SC: O(1)
// class Solution {
//     public int majorityElement(int[] nums) {
        
//     int count = 0,major = 0;
//     for(int num:nums){
//     if(count == 0){
//        major = num;

//     }if(num == major){
//          count ++;
//     }else{
//          count --;
//     }
// }
// return major;
//     }
// }