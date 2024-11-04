
class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        
    //Time Take 2 Sec
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (set.contains(b[i])) {
                count++;
                set.remove(b[i]); 
        }
        }
        
        return count; 
    }
}
        //Time Take Four Sec
//         int temp[] = new int[Math.min(m,n)];
//         int k =0;
//        for(int i=0;i<n;i++){
//            for(int j = 0;j<m;j++){
//                if(a[i] == b[j]){
//                    temp[k++] = a[i];
//                }
//            }
//        }
//        return k;
//     }
// };
    