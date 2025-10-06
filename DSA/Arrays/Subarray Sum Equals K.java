//! 560 Leetcode
//* I try to Solve by myself , 1 test only pass
// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int sum = 0;
//         for(int num : nums){
//             sum += num;
//         }
//         int result = sum -nums[nums.length-1]; 
//             return result;
//         }  
//     }


//* (Brute Force)
//* TC: O(n²)
//* SC: O(1)
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}


//*optimal Solution By Hareesh
//* TC: O(n)
//* SC: O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n =nums.length;
        if(n==0) return 0;
      
      int count = 0, prefixSum = 0;
      Map<Integer,Integer>  map = new HashMap<>();
       map.put(0,1);
      for(int i=0 ;i<n; i++){
        prefixSum += nums[i];
        int diff = prefixSum-k;
        if(map.containsKey(diff)){
        count += map.get(diff);
      }
      map.put(prefixSum, map.getOrDefault(prefixSum,0 ) +1);
    }
             return count;
        }  
    }
