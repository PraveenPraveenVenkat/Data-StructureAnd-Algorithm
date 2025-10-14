//! leetCode383
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];
        
        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
}


//! Hareesh approach
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
		
        int hash[] = new int[128];
        for(char i:magazine.toCharArray()){
            hash[i]++;
        }
           for(char i:ransomNote.toCharArray()){
            hash[i]--;
        }
        for(int i:hash){
            if(i<0){
                return false;
            }
        }
        return true;
    }
}

//! Another approach

import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        // Step 1: Count letters in magazine
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Check ransomNote letters
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false; // not enough of this letter
            }
            map.put(c, map.get(c) - 1);
        }

        // Step 3: All letters are available
        return true;
    }
}

