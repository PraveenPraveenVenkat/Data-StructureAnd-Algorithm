//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = sc.nextLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Solution ob = new Solution();
            int ans = ob.remove_duplicate(arr);
            for (int i = 0; i < ans; i++) {
                System.out.print(arr.get(i) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to remove duplicates from the given array
    public int remove_duplicate(List<Integer> arr) {
        // Code Here
     int n =arr.size();
     int m = 0;   // index for unique elements
        // if (arr.size < 2) return arr.size;

       
        for (int i = 0; i <n; i++) {
            if (!arr.get(m).equals(arr.get(i))) {
                m++; // move m to the next unique element
                arr.set (m,arr.get(i)); // update nums[j] with the new unique element
            }
        }
        return m + 1; // return the new length of the array
    }
}


// import java.util.List;

// class Solution {
//     // Function to remove duplicates from the given array (List in this case)
//     public int remove_duplicate(List<Integer> arr) {
//         // Return early if the list has fewer than 2 elements
//         if (arr.size() < 2) return arr.size();  // Use arr.size() instead of arr.size

//         int j = 0; // index for unique elements

//         // Iterate through the list starting from the second element
//         for (int i = 1; i < arr.size(); i++) {
//             if (!arr.get(i).equals(arr.get(j))) { // Compare elements using get() and equals()
//                 j++; // move j to the next unique element
//                 arr.set(j, arr.get(i)); // Update arr[j] with the new unique element
//             }
//         }

//         return j + 1; // Return the new length of the array
//     }
// }

