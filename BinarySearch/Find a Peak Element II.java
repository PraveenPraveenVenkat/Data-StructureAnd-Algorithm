class Solution {
    public static int row(int[][] arr,int n,int col){
        int r=-1;
        int ind=-1;
        for(int i=0;i<n;i++){
            if(arr[i][col]>r){
                r=arr[i][col];
                ind=i;
            }
        }
        return ind;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int low=0;
        int high=m-1;
        while(low<=high){
            int mid=(low+high)/2;
            int maxRow=row(mat,n,mid);
            int left= -1;
            int right= -1;
            if(mid-1 >=0){
                left=mat[maxRow][mid-1];
            }
            if(mid+1 <m){
                right=mat[maxRow][mid+1];
            }
            if(mat[maxRow][mid] >left && mat[maxRow][mid]>right){
                return new int[]{maxRow,mid};
            }
            else if(mat[maxRow][mid] >left){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }   
        return new int[]{-1,-1};    
    }
}