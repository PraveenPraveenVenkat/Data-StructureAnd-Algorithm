import java.util.*;

class closeComparator  implements Comparator  <Integer>{
   
   int x;
   public closeComparator (int x){
     this.x=x;
   }
public int compare (Integer a,Integer b) {
    int diff= Math.abs(b-x)-Math.abs(a-x);
    if(diff==0){
        return b-a;
    }
    return diff;
    
   }

    
}  
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> min=new PriorityQueue<>(new closeComparator(x));
 

        for(int num:arr){
       min.offer(num);
       if(min.size()>k){
        min.poll();
       }
        }
        List <Integer>  res= new ArrayList<Integer>(min);
         Collections.sort(res);
         return res;
    }
}


// //? Binary Search (With Explanation)
// class Solution {

//     // Approach:
//     // Using binary search and a sliding window, find the midpoint where,
//     // the integers between midpoint and midpoint + k is the k closest integers to x.

//     public List<Integer> findClosestElements(int[] arr, int k, int x) {

//         // The sliding window is between 'mid' and 'mid' + k.
//         int left = 0, right = arr.length - k;
//         while (left < right) {
//             int midpoint = left + (right - left) / 2; // same as (left + right) / 2

//             // With midpoint on the left, we use x - arr[midpoint], while arr[midpoint + k] - x because it is on the right.
//             // This is important!
//             // Rather than using Math.abs(), we need the direction keep the x within the sliding window.
//             // If the window is too far left, we shift the window to the right.
//             if (x - arr[midpoint] > arr[midpoint + k] - x) {
//                 left = midpoint + 1;
//             }
//             // If the window is too far right, we shift the window to the left.
//             else {
//                 right = midpoint;
//             }
//         }

//         // Input all the k closest integers into the result.
//         List<Integer> result = new ArrayList<>(k);
//         for (int i = left; i < left + k; i++) {
//             result.add(arr[i]);
//         }
//         return result;
//     }
// }

// //? Two Pointers
// class Solution {
    
//     // Approach:
//     // Using two pointers, we are going the 'start' and 'end' pointers towards each other,
//     // until only k elements between 'start' and 'end'.
    
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
//         int start = 0;
//         int end = arr.length - 1;
//         // Between the 'start' and 'end' pointers, inclusive, contains all the k integers that is closest to x.
//         while (end - start >= k) {
//             // Move 'start' to the right if 'end' is closer to x, or move 'end' to the left if 'start' is closer to x.
//             if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
//                 start++;
//             } else {
//                 end--;
//             }
//         }

//         // Input all the k closest integers into the result.
//         List<Integer> result = new ArrayList<>(k);
//         for (int i = start; i <= end; i++) {
//             result.add(arr[i]);
//         }
//         return result;
//     }
// }