//! 33 Leetcode
class Solution {
    public int search(int[] nums, int target) {
        if(nums==null || nums.length==0){
            return -1;
        }
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(nums[mid]==target) return mid;

            else if(nums[mid]>=nums[left]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            } else{
                if(nums[mid]<target && target<=nums[right]){
                    left=mid+1;
                } else{
                    right=mid-1;
                }
            }
        }
        return -1;
        
    }
}


//! Harresh Approach
class Solution {
    public int search(int[] nums, int target) {

     int left=0,right=nums.length-1;
     while(left <= right){
        int mid = left +(right-left)/2;

        if(nums[mid]== target) return mid;
        //left sorted Array
        if(nums[left]<=nums[mid]){
            if(target  >=nums[left]  && target <= nums[mid]){
                right=mid-1;

         }else {
           left =mid+1;
         }
        }else{
                 //  Right half is sorted
          if(target  > nums[mid]  && target <= nums[right]){
                 left=mid+1;
              }else{
                right=mid-1;
              }
        }
     }
     return -1;

    }
} 
       