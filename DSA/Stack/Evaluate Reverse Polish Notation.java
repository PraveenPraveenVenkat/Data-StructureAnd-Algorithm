//! 150 LeetCode 
Tc O()
Sc O ()
 class Solution {
     public int evalRPN(String[] tokens) {
      
      Stack<Integer> stack =new Stack<Integer>();
      int num1,num2;
      for(String i:tokens){

        switch(i){
        case "+" -> stack.add(stack.pop()+stack.pop());
        case "-" -> {
           num1=stack.pop();
          num2=stack.pop();
          stack.add(num2-num1);
        }
         case "*" -> stack.add(stack.pop()*stack.pop());
            case "/" -> {
           num1=stack.pop();
          num2=stack.pop();
          stack.add(num2/num1);
        }
 default -> stack.add(Integer.parseInt(i));
        } 
        
      }
    return  stack.pop();
     }
 }

// class Solution {
//     public int evalRPN(String[] tokens) {
//         Stack<Integer> stack = new Stack<>();

//         for (String c : tokens) {
//             if (c.equals("+")) {
//                 stack.push(stack.pop() + stack.pop());
//             } else if (c.equals("-")) {
//                 int second = stack.pop();
//                 int first = stack.pop();
//                 stack.push(first - second);
//             } else if (c.equals("*")) {
//                 stack.push(stack.pop() * stack.pop());
//             } else if (c.equals("/")) {
//                 int second = stack.pop();
//                 int first = stack.pop();
//                 stack.push(first / second);
//             } else {
//                 stack.push(Integer.parseInt(c));
//             }
//         }

//         return stack.peek();        
//     }
// }
 