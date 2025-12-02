//! 438 LeetCode Find All Anagrams in a String
//* TC O(N*26) or 0(N)
//* SC O(1)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        if(s==null||s.length()<p.length()) return res;
        int[] shash=new int[26];
        int[] phash = new int[26];
        int window =p.length();
        int left=0;
        int right=0;

        while(right< window){
            phash[p.charAt(right)-'a']++;
            shash[s.charAt(right)-'a']++;
            right++;
        }
         right--;
        while(right<s.length()){
           if(Arrays.equals(phash,shash)){
            res.add(left);
        } 
        right++;
        if(right !=s.length()){
           shash[s.charAt(right)-'a']++;
        }
        shash[s.charAt(left)-'a']--;
        left++;

        }
      return res;
    }
}