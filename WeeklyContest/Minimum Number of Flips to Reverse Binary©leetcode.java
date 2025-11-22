// class Solution {
//     public int minimumFlips(int n) {
//         String bin=Integer.toBinaryString(n);
//         StringBuilder sb =new StringBuilder(bin);
//         int count =0;
//         int  start=0,end=sb.length()-1;
//         while(start < end){
//              if(sb.charAt(start) !=sb.charAt(end)) {
//                  count++;
//              }
//             // if(sb.charAt(start) < sb.charAt(end)){
//             //     start++;
//             // }else{
//             //     end--;
//             // }
//             start++;
//             end--;
//         }
//     return count;
//     }
// }

class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
        int L = s.length();
        int flips = 0;
        
        int start = 0, end = L - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                flips += 2;   // both bits must flip
            }
            start++;
            end--;
        }
        
        return flips;
    }
}
