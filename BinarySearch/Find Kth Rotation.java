class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int low = 0, high = arr.size() - 1;
        int ans = -1, minEle = Integer.MAX_VALUE;
        if(arr.get(low) < arr.get(high)) {
            return low;
        }
     while(low <= high) {
            int mid = (low + high) / 2;
            
            if(arr.get(low) <=  arr.get(mid)) {
                if(arr.get(low) < minEle) {
                    minEle = arr.get(low);
                    ans = low;
                }
                low = mid + 1;
                
            } else {
                if(arr.get(mid) < minEle) {
                    minEle = arr.get(mid);
                    ans = mid;
                }
                high = mid - 1;
            }
            
        }
        
        return ans;
        
    }
}