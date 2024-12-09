class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int n = mat[0].length;
      int ans [] = new int[n*n];
      int i=0,j=0,k=0,p=0;
      // for top half matrix
      for(k=0;k<n;k++){
          i=0;j=k;
          if((i+j)%2==0){
              i=k; j=0;
              while(i>=0 && j<=k){
                  ans[p++]=mat[i][j];
                  i--;
                  j++;
              }
          }else{
              while(i<n && j>=0){
                ans[p++]=mat[i][j];
                i++;
                j--;
            }  
          }
      }
       // for bottom half matrix
      for(k=1;k<n;k++){
           i=k;j=n-1;
          if((i+j)%2==0){
              i=n-1; j=k;
              while(i>=0 && j<n){
                  ans[p++]=mat[i][j];
                  i--;
                  j++;
              }
          }else{
            while(i<n && j>=0){
                ans[p++]=mat[i][j];
                  i++;
                j--;
            }  
          }
      }
      return ans;
    }
}