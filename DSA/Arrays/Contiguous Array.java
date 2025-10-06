//! LeetCode 525
//* TC: O(n)
//* SC: O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        int sum =0, longest =0;
        int n=nums.length;

     Map<Integer, Integer > map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            sum += nums[i]== 0 ? -1 : 1;
        
        if(sum == 0){
            longest = i+1;
        }
        else if(map.containsKey(sum)){
             longest = Math.max(longest, i - map.get(sum));
        }else{
        map.put(sum,i);
        }
        }
        return longest;
    }
}