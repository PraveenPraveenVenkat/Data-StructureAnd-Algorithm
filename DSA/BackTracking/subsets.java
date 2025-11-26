//! 46 Subsets
//*TC O(2^N * N) 
//*SC O(N)


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res,nums,0, new ArrayList<>());
        return res;

    }
    private void backTrack(List<List<Integer>> res,int[] nums,int pos, List<Integer> temp){
        res.add(new ArrayList(temp));
        for(int i=pos;i<nums.length;i++){
            temp.add(nums[i]);
            backTrack(res,nums,i+1,temp);
            temp.remove(temp.size()-1);
        }
    }
}