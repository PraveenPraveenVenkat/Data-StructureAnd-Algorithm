class Solution {
    int floorSqrt(int n) {
        // Your code here
        // int ans=n/2;
        
        // if(ans %==0){
        //     return ans; 
        // }

        int low = 1;
        int high = n/2;
        int ans = -1;
        if (n == 1){
            return 1;
        }
             while(low<=high){
            int mid = low + ((high - low)/2);
            int num = mid * mid;
            if (num == n){
                return mid;
            }
                else if (num<n){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;      
     }
 }
 