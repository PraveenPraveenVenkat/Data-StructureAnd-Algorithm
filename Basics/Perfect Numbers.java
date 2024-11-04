

//User function Template for Java

class Solution {
    static int isPerfectNumber(long N) {
        // code here
     long sum = 0;
        for(int i=1;i<Math.sqrt(N);i++){
            if(N%i==0){
                sum=sum+i;
            
            if(N/i!=N)
                sum = sum+N/i;
            }
            
        }
        return sum==N?1:0;
    }
}
// Starting from 1 to (num - 1), find all the divisors of the number. 