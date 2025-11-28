//! 37 LeetCode
//* TCO(O(N^9)) SC(O(1))
//  */
class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean  solve(char[][] board){
    for(int row=0;row<9;row++){
        for(int col=0;col<9;col++){
            if(board[row][col] == '.'){
              for(char c='1';c<='9';c++){
                if(isvalid(board,row,col,c)){
                board[row][col]=c;
                if(solve(board)) return true;
                board[row][col]= '.';
                }
              }
              return false;
            }
        }
    }
    return true;
    }
    // private boolean isvalid(char[][] board,int row,int col,char c){
    //  for(int i=0;i<9;i++){
    //     if(board[i][col] ==c || board[row][i]==c || 
    //     board[*3 (row/3) + i/3] [3*(col/3) + i%3]==c]) return false;
    //  }
    //  return true;
    // }
     private boolean isvalid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == c || board[row][i] == c ||
                board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;
        }
        return true;
    }
}


Optmized isvalid Function
