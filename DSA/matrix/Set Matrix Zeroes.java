//! 73. Set Matrix Zeroes
class Solution {
    public void setZeroes(int[][] matrix) {

        int n = matrix.length, m = matrix[0].length;

        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int row : rows) {
            for (int j = 0; j < m; j++) {
                 matrix[row][j] = 0;
            }
            for (int col : cols) {
                for (int j = 0; j < n; j++) {
                     matrix[j][col] = 0;
                }
            }

        }

    }
}


//! 1 ms Code to Run the Problem
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int rows = matrix.length;
//         int cols = matrix[0].length;
//         int[] row = new int[rows];
//         int[] col = new int[cols];

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == 0) {
//                     row[i] = 1;
//                     col[j] = 1;
//                 }
//             }
//         }

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (row[i] == 1 || col[j] == 1) {
//                     matrix[i][j] = 0;
//                 }
//             }
//         }
//     }
// }