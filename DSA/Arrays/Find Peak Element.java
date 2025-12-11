//! LeetCode 162
//* TC: O(n)
//* SC: O(1)
class Solution {
    public int findPeakElement(int[] nums) {
        
        int n=nums.length;
        if(n==0){
            return -1;
        }
        int maxNumber=nums[0];
        int maxIndex=0;
        for(int i=0;i<n;i++){
             if(nums[i]>maxNumber){
                maxNumber = nums[i];
                maxIndex = i;
             }
        }
        return maxIndex;
    }
}



//? Binary Search Approach
//*TC: O(log n)
//*SC: O(1)
class Solution {
    public int findPeakElement(int[] nums) {
       int left=0;
       int right=nums.length-1;

       while(left<right){
        int mid= (left+right)/2;
        if(nums[mid]>nums[mid+1]){
            right=mid;
        }else{
            left=mid+1;
        }
       }    
       return left;   
    }
}