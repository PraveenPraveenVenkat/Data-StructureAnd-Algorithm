

class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
        // Your code here 
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            hs.add(arr2[j]);
        }
        return hs.size();
    }
}