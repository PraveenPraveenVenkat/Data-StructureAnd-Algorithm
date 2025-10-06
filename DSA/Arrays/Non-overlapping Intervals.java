//! LeetCode 435
//* TC: O(n log n)
//* SC: O(1)
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
              return a[1] - b[1];
            }
           
        });
        int remove = 0;
        int end = -10000;

        for(int [] interval : intervals ){
            if(interval[0]>=end){
                end =interval[1];
            }else{
             remove ++;
        }
          
        }
         return remove; 
    }
}