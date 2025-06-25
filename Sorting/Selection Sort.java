class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            int a=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[a]){
                    a=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[a];
            arr[a]=temp;
        }
    }
}


// class Solution {
//     void selectionSort(int[] arr) {
//         for(int i=0;i<arr.length-1;i++){
//             int a=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[a]){
//                     a=j;
//                 }
//             }
//             int temp=arr[i];
//             arr[i]=arr[a];
//             arr[a]=temp;
//         }
//     }
// }



// class Solution {
//   public:
//     // Function to perform selection sort on the given array.
//     void selectionSort(vector<int> &arr) {
//       int n=arr.size();
//       for(int i=0;i<n;i++){
//           int index=i;
//           for(int j=i+1;j<n;j++){
//               if(arr[index]>arr[j]){
//                   index=j;
//               }
//           }
//           swap(arr[i],arr[index]);
//       }
      
//     }
// };