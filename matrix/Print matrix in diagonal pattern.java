class Solution {
    public int[] matrixDiagonally(int[][] mat) {
       int n=mat.length,m=mat[0].length,row=0,col=0;
       int[] result=new int[n*m];
       for(int i=0;i<result.length;i++){
           result[i]=mat[row][col];
           if((row+col)%2==0){
               if(col==n-1){
                   row++;
               }else if(row==0){
                   col++;
               }else{
                   row--;
                   col++;
               }
           }else{
               if(row==m-1){
                   col++;
               }else if(col==0){
                   row++;
               }else{
                   row++;
                   col--;
               }
           }
       }
       return result;
    }
}