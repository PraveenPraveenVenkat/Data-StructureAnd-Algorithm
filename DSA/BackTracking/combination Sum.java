//! 39
//*TC O(2ⁿ) 
//*  SC O(N)
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        backTrack(res,candidates, target, 0, new ArrayList<>() );
        return res;
    }

    private void backTrack(List<List<Integer>> res,int[] candidates, int target, int pos,
                           List<Integer> temp) {   

        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = pos; i < candidates.length; i++) {
            temp.add(candidates[i]);
            backTrack( res,candidates, target - candidates[i], i, temp);
            temp.remove(temp.size() - 1);
        }
    }
}

//? Optimized Solution


class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(res,candidates, target, 0, new ArrayList<>() );
        return res;
    }

    private void backTrack(List<List<Integer>> res,int[] candidates, int target, int pos,
                           List<Integer> temp) {   

        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = pos; i < candidates.length; i++) {
            if(candidates[i]>target) return;
            temp.add(candidates[i]);
            backTrack( res,candidates, target - candidates[i], i, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
