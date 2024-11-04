//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int X = Integer.parseInt(inputLine[1]);
            int A[] = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            boolean ans = ob.find3Numbers(A, n, X);
            System.out.println(ans ? 1 : 0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean find3Numbers(int arr[], int n, int x) {

            // Your code Here
         Arrays.sort(arr);
         for(int i=0;i<n-1;i++){
            
        //  for(int i=0;i<n-2;i++){ //for approach 1 and 3
        //appraoch 1
        //   for(int j=i+1;j<n-1;j++){
        //       for(int k=j+1;k<n;k++){
        //           if(arr[i]+arr[j]+arr[k]==x) return true;
        //       }
        //   }
        
        //appraoch 2
         int target=x-arr[i];
          HashMap<Integer,Integer> map=new HashMap<>();
          for(int j=i+1;j<n;j++){
              int t=target-arr[j];
              if(map.containsKey(t)) return true;
              map.put(arr[j],1);
        
        //appraoch 3
            // int left=i+1;
            // int right=n-1;
            // while(left<right){
            //     int sum=arr[i]+arr[left]+arr[right];
            //     if(sum==x) return true;
            //     else if(sum>x) right--;
            //     else left++;
                
             }


    }
}
