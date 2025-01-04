class Solution {
    public int reverseExponentiation(int n) {
        // code here
         int rev=0,rem,cpy=n,ans=1;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        for(int i=0;i<rev;i++){
            ans=ans*cpy;
        }
        return ans;
        
    }
}
