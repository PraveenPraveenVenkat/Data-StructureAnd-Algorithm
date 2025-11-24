//! LeetCode  17 Letter Combinations of a Phone Number
//* TcO(4ⁿ)
//* O(n)
//? Hareesh Approach
class Solution {
    public List<String> letterCombinations(String digits) {
     List<String> result = new ArrayList<>();
      if (digits.isEmpty()) return result;
     String[] map  ={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     
     generate(digits,"",map,result);
     return result;

  }
     private void generate(String digits,String current,String [] map,List<String> result){
         if(current.length()== digits.length()){
        result.add(current);
        return;
     }

    //  int pos=current.length();
    //  char digitChar=digits.charAt(pos);
    //  int digit=digitChar -'0';
    //  String letter=map[digit];

               //or

     String letter= map[digits.charAt(current.length()) -'0'];
       
    
     for(char c:letter.toCharArray()){
     generate(digits,current +c,map,result);
     }
      
     }
} 



// class Solution {
//     public List<String> letterCombinations(String digits) {
//         List<String> res = new ArrayList<>();
        
//         if (digits == null || digits.length() == 0) {
//             return res;
//         }
        
//         Map<Character, String> digitToLetters = new HashMap<>();
//         digitToLetters.put('2', "abc");
//         digitToLetters.put('3', "def");
//         digitToLetters.put('4', "ghi");
//         digitToLetters.put('5', "jkl");
//         digitToLetters.put('6', "mno");
//         digitToLetters.put('7', "pqrs");
//         digitToLetters.put('8', "tuv");
//         digitToLetters.put('9', "wxyz");
        
//         backtrack(digits, 0, new StringBuilder(), res, digitToLetters);
        
//         return res;        
//     }

//     private void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> digitToLetters) {
//         if (idx == digits.length()) {
//             res.add(comb.toString());
//             return;
//         }
        
//         String letters = digitToLetters.get(digits.charAt(idx));
//         for (char letter : letters.toCharArray()) {
//             comb.append(letter);
//             backtrack(digits, idx + 1, comb, res, digitToLetters);
//             comb.deleteCharAt(comb.length() - 1);
//         }
//     }    
// }