class Solution {

    static int search(int arr[], int x) {

        // Your code here
        
            int i=0;
        int len = arr.length;
        while(i<len){
            if(arr[i] == x){
                return i;
            }
            i++;
        }
        return -1;
    }
}
