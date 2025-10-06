//! Leetcode 917
//* i tried only the first test Case Was Passed
class Solution {
    public String reverseOnlyLetters(String s) {
        
         char[] chars = s.toCharArray();
         StringBuilder sb = new StringBuilder();
         for(int i = chars.length - 1; i >= 0; i--){
          sb.append(chars[i]);
        }
        return sb.toString();
    }
}


//! Hareesh Approach Using Two Pointer Approach
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] str = s.toCharArray();   
        int start = 0, end = str.length - 1;

        while (start < end) {
            if (Character.isLetter(str[start])) {
                if (Character.isLetter(str[end])) {
                    char temp = str[end];
                    str[end] = str[start];
                    str[start] = temp;
                    start++;
                    end--;
                } else {
                    end--;
                }
            } else {
                start++;
            }
        }

        return new String(str);  
    }
}
