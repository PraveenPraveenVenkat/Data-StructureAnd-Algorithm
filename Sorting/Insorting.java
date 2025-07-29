

class Solution {
    public void insertionSort(int arr[]) {
        int n = arr.length;
        for(int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;

            while(i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }
}

// import java.util.Arrays;

// class Solution {
//     public void insertsort(int[] arr) {
//         Arrays.sort(arr); // Sorts the array in-place

//         // Print elements space-separated
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i]);
//             if (i < arr.length - 1) {
//                 System.out.print(" ");
//             }
//         }
//     }
// }

// class Solution {
    // Please change the array in-place
    // public void insertionSort(int arr[]) {
        // code here
        
        // arr.Sort();
        // Arrays.Sort(arr);
        // BubbleSort =new BubbleSort(arr);
        // Solution sol = new Solution();
        // sol.insertionSort(arr);
        //  System.out.println(Arrays.toString(arr)); 
         
         
    //  Array.Sort(arr);
    //  System.out.print( arr);
//       System.out.println(Arrays.toString(arr));
     
        
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] arr = {5, 3, 4, 1, 2};
        
//         sol.insertionSort(arr);
//         System.out.println(Arrays.toString(arr)); // Output: [1, 2, 3, 4, 5]
//     }
// }