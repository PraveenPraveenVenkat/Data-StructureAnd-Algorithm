class Solution {
    public int nthFibonacci(int n) {
        // code here
int x=0,y=1,z=0;
        if(n==0) return 0;
        if(n==1) return 1;
        for(int i = 2;i<=n;i++){
            z = x+y;
            x = y;
            y = z;
        }
        return y;
    }
}