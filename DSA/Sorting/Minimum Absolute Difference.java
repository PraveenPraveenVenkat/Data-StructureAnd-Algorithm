//! Leetcode 1200. Minimum Absolute Difference
//*TC O(n log n) 
//*SC O(n)
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);
    
    List<List<Integer>> res= new ArrayList<>();

     int minDiff = Integer.MAX_VALUE;
    for(int i=1;i < arr.length;i++){
           int current = arr[i] - arr[i-1];

           if(current<minDiff){
            res= new ArrayList<>();
            //* or
            //  res.clear();
            minDiff = current;
           }
           if(current == minDiff){
            res.add(Arrays.asList(arr[i-1],arr[i]));
           }
    }
    return res;
    }
}