//! 394 LeetCode
//* timecomplexity 

class Solution {
    public String decodeString(String s) {

  Stack<String> stack= new Stack<>();

  for(char ch: s.toCharArray()){
    if(ch != ']'){
      stack.push(String.valueOf(ch));
    }else {

        StringBuilder temp= new StringBuilder();

     while(!stack.peek().equals("[")){
        temp.insert(0,stack.pop());  
     }
      stack.pop(); 
       
        StringBuilder num = new StringBuilder();
        while(!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0))){
            num.insert(0,stack.pop());
        }
        String repeated = temp.toString().repeat(Integer.parseInt(num.toString()));
        stack.push(repeated);

    }
  
  }

 
   StringBuilder result = new StringBuilder();
   for(String str:stack )  result.append(str);
   return result.toString();
        
 }
}
