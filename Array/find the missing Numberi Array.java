

// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        
          int totalSum = (n*(n+1))/2;
          int currSum =0;
        
        for(int i:arr){
            currSum += i;
        }
         return totalSum - currSum;
    }
}
        
        // for (int i = 1; i <= arr; i++) {  
        //     boolean found = false;  
        //     for (int num : arr) {  
        //         if (num == i) {  
        //             found = true;  
        //             break;  
        //         }  
        //     }  
        //     if (!found) {  
        //         System.out.print(i + " ");  
        //     }  
        // //}  
      //  findMissingNumbers(arr);  
        // System.out.println(); // Add a newline to separate the output.  
    // }  
       //findMissingNumbers(arr);  
      //public static void main(String[] args) {  
       // int[] arr = {1, 2, 4, 6, 7};  
    //      int max = 7;  
        
        
        
        