//! Leetcode 169
class Solution {
    public int majorityElement(int[] nums) {
        
       Arrays.sort(nums);
       int n = nums.length;
       return nums [n/2];      

    }
}

//* Hareesh Solution
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