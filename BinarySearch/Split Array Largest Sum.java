class Solution {
    static int splitArray(int[] arr , int N, int K) {
        // code here
        if(K > N) return -1;
        int l=0;
        int h=0;
        for(int i=0;i<N;i++){
            l=Math.max(l,arr[i]);
            h+=arr[i];
        }
        int result=h;
            while(l<=h){
                int m=(l+h)/2;
                
                int sub=1;
                int count=0;
                for(int i=0;i<N;i++){
                    if(count +arr[i] > m){
                        sub++;
                        count=arr[i];
                    }
                    else count+=arr[i];
                }
    
                if(sub > K) l=m+1;
                else{
                    result=m;
                     h=m-1;
                }   
            }
            return result;
    }
};