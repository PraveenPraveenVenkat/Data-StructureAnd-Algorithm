//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().valueEqualToIndex(arr, n);
            if (ans.size() == 0) {
                System.out.println("Not Found");
            } else {
                StringBuilder sb = new StringBuilder();
                for (int x : ans) {
                    sb.append(x + " ");
                }
                System.out.println(sb);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        

//User function Template for Java


class Solution {
    ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
          
        ArrayList<Integer> arrlist = new ArrayList<Integer>();  // Declare new Array List to collect Answers
        for(int i=0; i<n; i++){
            if(arr[i]==i+1){ // checking that Value at ith Position is equal to it index value or not ?
                arrlist.add(i+1); // if Value at Ith Position is equal to its index value then it will be added to ArrayList
            }
        }
        return arrlist; // return Array list as an Answer
    }
}
    }
}