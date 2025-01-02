class Solution {
    static int factorial(int n) {
        // code here
        int fact =1;
        if (n==0 || n==1){
           return 1;
        }
          for (int i = 1; i <= n; i++) {
            fact =fact * i;
         
        
        }
         return fact;
    }
}