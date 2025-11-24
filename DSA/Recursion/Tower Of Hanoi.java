//! GFG  Tower Of Hanoi
//* O(2ⁿ)
//* O(n)
class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        if(n==0) return 0;
        int move=0;
        move+= towerOfHanoi(n-1,from,aux,to);
        move++;
          move+= towerOfHanoi(n-1,aux,to,from);
          return move;
    }
}
