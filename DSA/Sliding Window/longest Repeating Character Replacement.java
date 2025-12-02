//!  424 LeetCode Longest Repeating Character Replacement
//* TC O(N)
//* SC O(1) 
class Solution {
    public int characterReplacement(String s, int k) {
          Map<Character, Integer> freq = new HashMap<>();
        int left = 0, maxFreq = 0, maxWindow = 0;

      
        for (int right = 0; right < s.length(); right++) {
        char ch=s.charAt(right);
        //Increment  the   frequency  of the  current  character 
         freq.put(ch,freq.getOrDefault(ch,0)+1);

         //update the  maximun frequency  of the any character in  the window
         maxFreq=Math.max(maxFreq,freq.get(ch));
             
        int windowsLength= right-left+1;     
        int characterNeedToChange = windowsLength - maxFreq;
         
         //if more than  k replace are needed,shrink  the window
        if(characterNeedToChange > k){
          char leftchar =s.charAt(left);
          freq.put(leftchar,freq.get(leftchar)-1);
            left++;
        }
        //update the  maximun window length
        maxWindow =Math.max(maxWindow,right-left+1);
        }
        return  maxWindow;
    }
}


//? Another Approach  we Know that there are  total  256  ASCII characters
class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0, maxFreq = 0, maxWindow = 0;
        int[] freq = new int[26];
        // Map<Character, Integer> freq = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            //Increment  the   frequency  of the  current  character 
            //  freq.put(ch,freq.getOrDefault(ch,0)+1);
            freq[ch - 'A']++;
            //update the  maximun frequency  of the any character in  the window
            //  maxFreq=Math.max(maxFreq,freq.get(ch));
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            int windowsLength = right - left + 1;
            int characterNeedToChange = windowsLength - maxFreq;

            //if more than  k replace are needed,shrink  the window
            if (characterNeedToChange > k) {
                // char leftchar =s.charAt(left);
                //   freq.put(leftchar,freq.get(leftchar)-1);
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            //update the  maximun window length
            maxWindow = Math.max(maxWindow, right - left + 1);
        }
        return maxWindow;
    }
}

