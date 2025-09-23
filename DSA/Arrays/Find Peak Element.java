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