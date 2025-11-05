//! LeeetCode 15. 3Sum
//* O(N^2)
//* SC O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
              Arrays.sort(nums);
            List<List<Integer>> res=new ArrayList<>();
          int n=nums.length;

for(int i=0;i<n-1;i++){
    //* Pointer 1 avoiding Duplicate in i;
    if(i==0 || (i>0 && nums[i]!= nums[i-1])){
    int low=i+1,high=n-1, target =-nums[i]; 
    while(low<high){
        int currentValue=nums[low]+nums[high];
    if(currentValue== target){
   res.add(Arrays.asList(nums[i],nums[low],nums[high]));
    //* Avoiding Duplicates for low and high
   while(low<high && nums[low]==nums[low+1]) low++;
   while(low<high && nums[high]==nums[high-1]) high--;
   low++;
   high--;
    }else if(currentValue > target) {
high--;
    }else{
        low++;
      }
     }
    }
  }
     return res;
    }
  }

// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         Arrays.sort(nums);
//           int n= nums.length;
//         List<List<Integer>> res = new ArrayList<>();

//              if (i > 0 && nums[i] == nums[i-1]) {
//                  continue;
//              }
//             if(nums == 0 || (i>0 && nums[i]!= nums[i-1]) )

//             int j = i + 1;
//             int k = nums.length - 1;

//             while (j < k) {
//                 int total = nums[i] + nums[j] + nums[k];

//                 if (total > 0) {
//                     k--;
//                 } else if (total < 0) {
//                     j++;
//                 } else {
//                     res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                     j++;

//                     while (nums[j] == nums[j-1] && j < k) {
//                         j++;
//                     }
//                 }
//             }
//         }
//         return res;        
//     }
// }