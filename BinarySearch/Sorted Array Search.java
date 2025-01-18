class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        // int low=0;
        // int hig=k-1;
        
        // while(low<=hig){
    //         int mid =low+hig/2;
    // if(arr==hig){
        //             return mid;
        //         }elseif(hig>mid){
        //             return low =mid+1;
        //         }else hig=mid-1
        //     }
        //     return-1
            
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k) return true;
        }    
        return false;
         }
    
    }
    
    
    
    