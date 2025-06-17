class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
             int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        int low=1;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
           int cnt=dev(mid,nums,threshold);
             if(cnt<=threshold){
                high=mid-1;
                ans=mid;
            }
            else
            low=mid+1;
        }
        return ans;
    }
    int dev(int mid,int[]nums,int threshold){
           int cnt=0;
            for(int i=0;i<nums.length;i++){
                if(cnt>threshold)
                break;
                if(nums[i]%mid!=0){
                    cnt+=(nums[i]/mid)+1;
                }
                else{
                    cnt+=nums[i]/mid;
                }
            }
          return cnt;
    }
}