class Solution {
    int[][] rotateMatrix(int k, int mat[][]) {
        // code here
        
         int n=mat.length;
        int m=mat[0].length;
        int K=k%m;
        for(int i=0;i<n;i++){
            ok(mat,K,m-1,i);
            ok(mat,0,m-1,i);
            ok(mat,m-K,m-1,i);            
        }
        return mat;
    }
    public static void ok(int[][] Mat, int left, int right, int i) {
        while (left <= right) {
            int temp = Mat[i][left];
            Mat[i][left] = Mat[i][right];
            Mat[i][right] = temp;
            left++;
            right--;
        }
    }
}