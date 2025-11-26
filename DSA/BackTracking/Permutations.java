//! 46 LeetCode 
//* TC O(n*n!) 
//*SC O(n) 
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        // boolean[] used = new boolean[nums.length];
        // List<Integer> temp = new ArrayList<>();
         backtracking(nums,new boolean[nums.length],new ArrayList<>(),res);
        // backtracking(nums, used, temp, res);
         return res;
    }

    private void backtracking(int[] nums, boolean[] used, List<Integer> temp, List<List<Integer>> res) {
        // Base case: if permutation is complete
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;    // already used in this permutation
            // choose
            used[i] = true;
            temp.add(nums[i]);
            // explore
            backtracking(nums, used, temp, res);
            // un-choose
            used[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}

// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
        
//         List<List<Integer> res= new ArrayList<>();

//         backtracking(res,nums,);
//     }
//     private void backtracking(List<List<Integer> res,int used,int nums){

       
       
//             if(temp.size()==nums.length){
//                 res.add(new ArrayList<>(temp));
//                 return;
            

//              for(int i=0;i<nums.length;i++){
//               if(used[i]) continue;
//               used[i] =true;
//               temp.add(nums[i]);
//               backtracking(res,nums,);
//               temp.remove(nums[i]);
//               used[i] =false;

//             }
           

            
//         }

        
//     }
// }