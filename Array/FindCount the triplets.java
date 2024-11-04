
class Solution {
    int countTriplet(int arr[], int n) {
        // code here
       
         HashSet<Integer> a = new HashSet<>();
        int count = 0;


        for (int i = 0; i < n; i++) {
            a.add(arr[i]);
        }

      
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                if (a.contains(sum)) {
                    count++;
                }
            }
        }

        return count;
        
    }
}
