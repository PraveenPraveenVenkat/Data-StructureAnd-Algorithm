
class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        
       
        int temp[] = new int[Math.min(m,n)];
        int k =0;
       for(int i=0;i<n;i++){
           for(int j = 0;j<m;j++){
               if(a[i] == b[j]){
                   temp[k++] = a[i];
               }
           }
       }
       return k;
    }
};
    