

// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) {
        // add your code here
    //     temp []= [3,4,5];
    //   return arr.reverseOrder()
        
       ArrayList<Integer> list = new ArrayList<>();
        
        if(d>n){
           d = d%n; 
        }
        for(int i=0; i<d; i++){
            list.add(arr[i]);
        }
        int count = 0;
        for(int i=d; i<n; i++){
            arr[count] = arr[i];
            count ++;
        }
        
        for(int i=0; i<d; i++){
            arr[count] = list.remove(0);
            count++;
        }

    }

}
       

// }
// Suppose the give array is arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2.

// First Step:
//     => Store the elements from 2nd index to the last.
//     => temp[] = [3, 4, 5, 6, 7]

// Second Step: 
//     => Now store the first 2 elements into the temp[] array.
//     => temp[] = [3, 4, 5, 6, 7, 1, 2]

// Third Steps:
//     => Copy the elements of the temp[] array into the original array.
//     => arr[] = temp[] So arr[] = [3, 4, 5, 6, 7, 1, 2]