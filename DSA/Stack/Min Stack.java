//!155 LeetCode
Tc(N)
Sco(N)

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;


    public MinStack() {
    stack= new Stack<>();
    minStack= new Stack<>();
        
    }
    
    public void push(int val) {
        if(minStack.isEmpty()){
            stack.push(val);
            minStack.push(val);

        }else{
             stack.push(val);
             minStack.push(Math.min(val,minStack.peek()));
        }
        
    }
    
    public void pop() {
         stack.pop();
         minStack.pop();
    }
    
    public int top() {
       return  stack.peek();
    }
    
    public int getMin() {
        return  minStack.peek();
    }
}

// /**
//  * Your MinStack object will be instantiated and called as such:
//  * MinStack obj = new MinStack();
//  * obj.push(val);
//  * obj.pop();
//  * int param_3 = obj.top();
//  * int param_4 = obj.getMin();
//  */


// class MinStack {
//     private List<int[]> st;

//     public MinStack() {
//         st = new ArrayList<>();
//     }
    
//     public void push(int val) {
//         int[] top = st.isEmpty() ? new int[]{val, val} : st.get(st.size() - 1);
//         int min_val = top[1];
//         if (min_val > val) {
//             min_val = val;
//         }
//         st.add(new int[]{val, min_val});        
//     }
    
//     public void pop() {
//          st.remove(st.size() - 1);
//     }
    
//     public int top() {
//          return st.isEmpty() ? -1 : st.get(st.size() - 1)[0];
//     }
    
//     public int getMin() {
//          return st.isEmpty() ? -1 : st.get(st.size() - 1)[1];
//     }
// }

