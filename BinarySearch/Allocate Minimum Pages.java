class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
             int n=arr.length;
        if(k>n) return -1;
        int l=arr[0];
        int h=0;
        for(int i=0;i<n;i++){
            l=Math.max(l,arr[i]);
            h+=arr[i];
        }
        
        int result = h;
        while(l<=h){
            int m = (l+h)/2;
            
            int sub=1;
            int count=0;
            for(int i=0;i<n;i++){
                if(count + arr[i] > m){
                    sub++;
                    count=arr[i];
                }
                else count+=arr[i];
            }
            
            if(sub > k){
                l=m+1;
            }
            else {
                result = m;
                h=m-1;
            }
        }
        return result;
    }
}






                  //! Option 2
           //? Try to learn
//          if(k > arr.length) return -1;
        
//         int start = 0;
//         int end = Arrays.stream(arr).sum();
//         int ans = -1;
        
//         while(start <= end) { // Binary Search
//             int mid = (start + end) / 2;
            
//             if(isValid(mid, arr, k)) {
//                 ans = mid;
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }
        
//         return ans;
//     }
    
//     public static boolean isValid(int maxPages, int[] arr, int k) {
//         int studentCount = 1;
//         int currPages = 0;
        
//         for(int i=0; i<arr.length; i++) {
//             if(arr[i] > maxPages) return false; // Edge case
            
//             if(currPages + arr[i] > maxPages) {
//                 studentCount++;
//                 currPages = arr[i];
//             } else {
//                 currPages += arr[i];
//             }
//         }
        
//         return (studentCount <= k);
//     }
// }