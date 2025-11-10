//! 20 LeetCode
//*  TimeComplexity O(n)
//*  SpaceComplexity O(n)

// * Hareesh Approach
class Solution {
    public boolean isValid(String s) {
      
      Stack<Character> stack =new  Stack<Character>();
      //() ,{} []
     // ['(',')',{','}','[','],]
      for(char ch:s.toCharArray()){
        if( ch == '(') stack.push (')');
           else   if( ch == '{') stack.push ('}');
               else     if( ch == '[') stack.push (']');
        else if(stack.isEmpty() || stack.pop()!= ch) return false;
      }
        return stack.isEmpty(); 
    }
}



// class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
//         for (char ch : s.toCharArray()) {
//             if (ch == '(' || ch == '[' || ch == '{') {
//                 stack.push(ch);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
//                 char top = stack.pop();
//                 if (ch == ')' && top != '(') {
//                     return false;
//                 }
//                 if (ch == ']' && top != '[') {
//                     return false;
//                 }
//                 if (ch == '}' && top != '{') {
//                     return false;
//                 }
//             }
//         }
//         return stack.isEmpty();
//     }
// }