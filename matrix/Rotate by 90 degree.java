class Solution {
    // Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int matrix[][]) {
        // code here
         int temp=0;
        int n=matrix[0].length;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length/2;j++){
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[i][n-j-1];
                     matrix[i][n-j-1]=temp;
                     
                 }
             }
                   for(int i=0;i<matrix.length;i++){
                 for(int j=i;j<matrix[0].length;j++){
                     temp=matrix[i][j];
                     matrix[i][j]=matrix[j][i];
                     matrix[j][i]=temp;
                  }
          }
      }