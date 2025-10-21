//! 54. Spiral Matrix
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<Integer>();
        int n = matrix.length, m = matrix[0].length;
        int dir = 0;

        int left = 0, right = m - 1, top = 0, bottom = n - 1;

        while (left <= right && top <= bottom) {
            switch (dir) {
                case 0 -> {
                    // Left to Right
                    for (int i = left; i <= right; i++) {
                        result.add(matrix[top][i]);
                    }
                    top++;
                }
                case 1 -> {
                    // Top to Bottom
                    for (int i = top; i <= bottom; i++) {
                        result.add(matrix[i][right]);
                    }
                    right--;
                }
                case 2 -> {
                    // Right to Left
                    for (int i = right; i >=left; i--) {
                        result.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                case 3 -> {
                    // Bottom to Top
                    for (int i = bottom; i >= top; i--) {
                        result.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            dir = (dir + 1) % 4;
        }
        return result;
    }
}




//! Traditional Switch Method
// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         List<Integer> result = new ArrayList<>();
//         int n = matrix.length, m = matrix[0].length;
//         int dir = 0; // direction: 0->L->R, 1->T->B, 2->R->L, 3->B->T

//         int left = 0, right = m - 1, top = 0, bottom = n - 1;

//         while (left <= right && top <= bottom) {
//             switch (dir) {
//                 case 0: // Left to Right
//                     for (int i = left; i <= right; i++) {
//                         result.add(matrix[top][i]);
//                     }
//                     top++;
//                     break;

//                 case 1: // Top to Bottom
//                     for (int i = top; i <= bottom; i++) {
//                         result.add(matrix[i][right]);
//                     }
//                     right--;
//                     break;

//                 case 2: // Right to Left
//                     for (int i = right; i >= left; i--) {
//                         result.add(matrix[bottom][i]);
//                     }
//                     bottom--;
//                     break;

//                 case 3: // Bottom to Top
//                     for (int i = bottom; i >= top; i--) {
//                         result.add(matrix[i][left]);
//                     }
//                     left++;
//                     break;
//             }

//             dir = (dir + 1) % 4; // change direction
//         }

//         return result;
//     }

//     // Test
//     public static void main(String[] args) {
//         int[][] matrix = {
//             {1, 2, 3},
//             {4, 5, 6},
//             {7, 8, 9}
//         };

//         Solution sol = new Solution();
//         System.out.println(sol.spiralOrder(matrix));
//     }
// }
