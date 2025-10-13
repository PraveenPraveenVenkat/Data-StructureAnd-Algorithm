//! GFG
class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for(int num:a){
            set.add(num);
        }
        for(int num:b){
            set.add(num);
        }
     return new ArrayList<>(set);
    }
}





//Old Submission
// class Solution {
//     public static int doUnion(int arr1[], int arr2[]) {
//         // Your code here
//         HashSet<Integer> hs = new HashSet<>();
//         for(int i=0;i<arr1.length;i++){
//             hs.add(arr1[i]);
//         }
//         for(int j=0;j<arr2.length;j++){
//             hs.add(arr2[j]);
//         }
//         return hs.size();
//     }
// }