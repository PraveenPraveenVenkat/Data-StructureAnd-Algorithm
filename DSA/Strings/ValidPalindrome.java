//!125 leetcode
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char i : s.toCharArray()) {
            if (Character.isLetterOrDigit(i)) {
                newStr.append(Character.toLowerCase(i));
            }
        }
        int l = 0, r = newStr.length() - 1;
        while (l < r) {
            if (newStr.charAt(l++) != newStr.charAt(r--)) return false;
        }
        return true;
    }
}

//*Haresh Approach , we  used two pointer approach 
class Solution {
    public boolean isPalindrome(String s) {

      StringBuilder sb = new StringBuilder();
      for(char i:s.toCharArray()){
        if(Character.isLetter(i) || Character.isDigit(i)){
         sb.append(Character.toLowerCase(i));

        }
     }
     String temp =sb.toString(); //alphanumeric
     int left =0 ,right = temp.length()-1; //* we can name it as left as i and right as j 
     while(left<right){
        if(temp.charAt(left)!=temp.charAt(right)){
        return false;
        }
      left++;
      right--;
     }
     return true;
    }

}