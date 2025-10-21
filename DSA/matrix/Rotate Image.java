//! 48. Rotate Image
class Solution {
    private void swapDiagonal(int [] [] matrix, int row, int col){
        int temp= matrix[row][col];
        matrix[row][col]=matrix[col][row];
        matrix[col][row]= temp;
    }
    private void reverseArray(int []arr,int start,int end){
      while(start<=end){
         int temp=arr[start];
         arr[start]=arr[end];
         arr[end]= temp;
         start++;
         end--;
      }
    }
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        // Transpose
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){

             swapDiagonal(matrix,i,j);
       
            }
        }
        for(int i=0;i<n;i++){
            reverseArray(matrix[i],0,n-1);
        }

    }
}