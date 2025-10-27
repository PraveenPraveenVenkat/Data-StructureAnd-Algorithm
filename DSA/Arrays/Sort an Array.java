//! LeetCode 912
//* TC: O(n log n)
//* SC: O(1)
class Solution {
    public int[] sortArray(int[] nums) {
            Arrays.sort(nums);
            return nums;
        }

    }

//! Merge Sort
//* TC: O(n log n)
//* SC: O(n)
  //? Hareesh Approach
// class Solution {
//     public int[] sortArray(int[] nums) {
//         mergeSort(nums, 0, nums.length - 1);
//         return nums;
//     }

//     private void mergeSort(int[] arr, int left, int right) {
//         if (left >= right) {
//             return;
//         }
//         int mid = left + (right - left) / 2;
//         mergeSort(arr, left, mid);
//         mergeSort(arr, mid + 1, right);
//         //Merging Or Conquer
//         merge(arr, left, mid, right);
//     }

//     private void merge(int[] arr, int left, int mid, int high) {
//         int n1 = mid - left + 1;
//         int n2 = high - mid;
//         int[] l1 = new int[n1];
//         int[] l2 = new int[n2];

//         //Create List 1
//         for (int i = 0; i < n1; i++)
//             l1[i] = arr[left + i];

//         //Create List 2
//         for (int j = 0; j < n2; j++)
//             l2[j] = arr[mid + 1 + j];

//         int i = 0, j = 0, counter = 0;
//         int res[] = new int[n1 + n2];

//         while (i < n1 && j < n2) {
//             if (l1[i] < l2[j]) {
//                 res[counter] = l1[i];
//                 i++;
//             } else {
//                 res[counter] = l2[j];
//                 j++;
//             }
//             counter++;
//         }
//         while (i < n1) {
//             res[counter++] = l1[i++];
//         }
//         while (j < n2) {
//             res[counter++] = l1[j++];
//         }

//         for (int k = 0; k<n1+n2; k++)  arr[left + k] = res[k];
//     }
// }


// //? Optimal Approach
// class Solution {
//     public int[] sortArray(int[] nums) {
//         mergeSort(nums, 0, nums.length - 1);
//         return nums;
//     }

//     private void mergeSort(int[] arr, int left, int right) {
//         if (left >= right) {
//             return;
//         }
//         int mid = left + (right - left) / 2;
//         mergeSort(arr, left, mid);
//         mergeSort(arr, mid + 1, right);
//         //Merging Or Conquer
//         merge(arr, left, mid, right);
//     }

//     private void merge(int[] arr, int left, int mid, int high) {
//         int n1 = mid - left + 1;
//         int n2 = high - mid;
//         int[] l1 = new int[n1];
//         int[] l2 = new int[n2];

//         //Create List 1
//         for (int i = 0; i < n1; i++)
//             l1[i] = arr[left + i];

//         //Create List 2
//         for (int j = 0; j < n2; j++)
//             l2[j] = arr[mid + 1 + j];

//         int i = 0, j = 0, counter = left;
//         // int res[] = new int[n1 + n2];

//         while (i < n1 && j < n2) {
//             if (l1[i] < l2[j]) {
//                 arr[counter] = l1[i];
//                 i++;
//             } else {
//                 arr[counter] = l2[j];
//                 j++;
//             }
//             counter++;
//         }
//         while (i < n1) {
//             arr[counter++] = l1[i++];
//         }
//         while (j < n2) {
//             arr[counter++] = l1[j++];
//         }

//         // for (int k = 0; k<n1+n2; k++)  arr[left + k] = res[k];
//     }
// }






    

//* TC: O(n²)
//* SC: O(1)
// class Solution {
//     public int[] sortArray(int[] nums) {
         //* Simple bubble sort
//         for (int i = 0; i < nums.length - 1; i++) {
//             for (int j = 0; j < nums.length - i - 1; j++) {
//                 if (nums[j] > nums[j + 1]) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }
//         return nums;
//     }
// }