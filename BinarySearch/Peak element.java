class Solution {

    public int peakElement(int[] arr) {
        // code here
        
         if(arr.length == 0){
            return -1;
        }
        int n = arr.length;
        if(n==1){
            return 0;
        }
         if(arr[n-1]>arr[n-2]){
            return n-1;
        }
        
        for(int i = 0; i<arr.length; i++){
            if((i==0|| arr[i]>arr[i-1]) && (i== n-1|| arr[i]>arr[i+1])){
                return i;
            }
        }
        return -1;
    }
}