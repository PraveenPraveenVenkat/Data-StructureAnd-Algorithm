//! Leetcode 324. Wiggle Sort II
class Solution {
    public void wiggleSort(int[] nums) {
   
        // int n = nums.length-1;
        // int[] arr = Arrays.copyOf(nums,nums.length);
        // Arrays.sort(arr);
        // for(int i=1;i<nums.length;i+=2){
        //     nums[i]=arr[n--];
        // }
        // for(int i=0;i<nums.length;i+=2){
        //     nums[i]=arr[n--];
        //}

//*TC O(n log n)
//*SC O(n)
            Arrays.sort(nums);
            int mid = (nums.length-1)/2;
            int right = nums.length -1;
            int counter =0;
            int res[] =new int [right+1];

            while(mid>=0 ||right > (nums.length-1)/2){
              if(counter%2 ==0){
                res[counter++]=nums[mid--];
              }else{
              res[counter++]=nums[right--];
              }
            }
            for(int i=0;i<nums.length;i++){
                nums[i]=res[i];
            }

    }
}