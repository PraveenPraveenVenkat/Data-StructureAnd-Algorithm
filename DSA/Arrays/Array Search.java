class Solution {
    public int search(int arr[], int x) {
        // code here
     for(int i=0; i<arr.length;i++){
         if(arr[i]== x){
             return i;
         }
     }
     return -1;
        
    }
}


//* old Submission
// class Solution {
//     static int search(int arr[], int x) {
//             int i=0;
//         int len = arr.length;
//         while(i<len){
//             if(arr[i] == x){
//                 return i;
//             }
//             i++;
//         }
//         return -1;
//     }
// }