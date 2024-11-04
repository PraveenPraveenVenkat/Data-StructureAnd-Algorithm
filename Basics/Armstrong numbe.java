/ User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here

        class Solution:
    def armstrongNumber (self, n):
        l=n
        result=0
        while n>0:
            result+=((n%10)**3)
            n//=10
        return "true" if l==result else "false"
    }
}