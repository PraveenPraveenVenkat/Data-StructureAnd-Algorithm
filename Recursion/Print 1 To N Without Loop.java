
class Solution {

    public void printNos(int n) {
        // Your code here
        
        // One(){
            if(n<1){
                 return;
                }
            printNos (n - 1);
            System.out.print(n + " ");
        }
        public static void main(String[]args){
            Solution solution =new Solution ();
            solution.printNos(10);
        }
        
    }

// `class Solution {

//     // Non-static method
//     public void printNos(int n) {
//         if (n < 1) {
//             return; // Base case
//         }
//         printNos(n - 1); // Recursive call
//         System.out.print(n + " "); // Print the current number
//     }

//     public static void main(String[] args) {
//         // Create an object of the Solution class
//         Solution solution = new Solution();

//         // Call the non-static method using the object
//         solution.printNos(10); // Example: Prints numbers from 1 to 10
//     }
// }
