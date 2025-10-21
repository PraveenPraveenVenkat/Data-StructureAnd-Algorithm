//! LeetCode 36
//* 15 ms to Run the Problem 
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<String,Integer> map= new HashMap<>();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(board[i][j] !='.'){

                String row =board[i][j] + "Row" +i;
                String col =board[i][j] + "Col" +j;
                String box =board[i][j] + "Box" + (i/3)  +"and" + (j/3);



                map.put(row, map.getOrDefault(row,0)+1);
                map.put(col, map.getOrDefault(col,0)+1);
                map.put(box, map.getOrDefault(box,0)+1);



                if(map.get(row)>1 || map.get(col)>1 || map.get(box) > 1)return false;
                 
            }
        }

                }
        return true;
    }
}

//! 1 ms  to Run the Problem
// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         int[] row = new int[9];
//         int[] col = new int[9];
//         int[][] boxes = new int[3][3];

//         for(int i = 0; i < 9; i++) {
//             for(int j = 0; j < 9; j++) {
//                 while(j < 9 && board[i][j] == '.') {
//                     j++;
//                 }
//                 if(j < 9) {
//                     int d = board[i][j] - '0';
//                     int bit = 1 << (d - 1);
//                     if((row[i] & bit) != 0 || 
//                         (col[j] & bit) != 0 || 
//                         (boxes[i/3][j/3] & bit) != 0) {
//                         return false;
//                     } else {
//                         row[i] |= bit;
//                         col[j] |= bit;
//                         boxes[i/3][j/3] |= bit;
//                     }
//                 }
//             }
//         }
//         return true;
//     }
// }