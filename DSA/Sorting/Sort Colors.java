class Solution {
    private void swap(int[] nums, int ind1, int ind2) {

        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }

    public void sortColors(int[] nums) {
         int low=0,mid=0,high=nums.length-1;
       while( mid <= high){
       if(nums [mid]==2){
         swap(nums,mid,high--);
         
       }else if(nums [mid]==0){
         swap(nums,low++,mid++)
       }else{
         mid++;
       }
      
    }
}