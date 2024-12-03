class Solution {
    int minRow(int mat[][]) {
        // code here
          int[] s = new int[n];
        int g = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                s[i] += a[i][j];
            }
        }
        int t = s[0],r=0;
        for(int i=1;i<n;i++)
        {
            if(s[i] < t)
            {
                t = s[i];
                r = i;
            }
        }
    return r+1;
        
    }
};