class Solution {
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        
          int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i=0;i<n;i++){
            high += arr[i];
            low = Math.max(low,arr[i]);
        }
        while(low<=high){
            int mid = (low + high)/2;
            if(findDays(arr,mid)<=d){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    static int findDays(int[] arr, int capacity){
        int days = 1,load = 0;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>capacity){
                  days++;
                load=arr[i];
            }
            else{
                load+=arr[i];
            }
        }
        return days;
        
    }
};