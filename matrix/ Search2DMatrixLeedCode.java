class Solution {
    int minRow(int mat[][]) {
        int n = mat.length; // Number of rows
        int m = mat[0].length; // Number of columns
        
        int[] s = new int[n];
        int g = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                s[i] += mat[i][j];
            }
        }
        
        int t = s[0], r = 0;
        for (int i = 1; i < n; i++) {
            if (s[i] < t) {
                t = s[i];
                r = i;
            }
        }
        
        return r + 1; // Returning 1-based index
    }
}
