// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
   int [] arr={400,13,6,8,3,200,2};
   int n=arr.length;
   for(int i=0;i<n;i++){
     int smallest=i;
       for(int j=i+1;j<n;j++){
           if(arr[j]<arr[smallest]){
               smallest=j;

           }
       }
      int temp = arr[i];
               arr[i]=arr[smallest];
               arr[smallest]= temp;
   }
      for(int i:arr){
      System.out.print(i+"  ");
   }
    }
}

// class Main {
//     public static void main(String[] args) {
//         int[] arr = {400, 13, 6, 8, 3, 200, 2};
//         int n = arr.length;

//         for (int i = 0; i < n; i++) {
//             int smallest = i;

//             // Debug: show current part of the array and index i
//             System.out.println("\nIteration i=" + i + ", current array: ");
            // for (int k : arr) System.out.print(k + " ");
            // System.out.println();

//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[smallest]) {
//                     smallest = j;

//                     // Debug: when smallest changes
                    // System.out.println("  New smallest found at j=" + j + " -> " + arr[j]);
//                 }
//             }

//             // Swap i and smallest
//             int temp = arr[i];
//             arr[i] = arr[smallest];
//             arr[smallest] = temp;

//             // Debug: after swap
            // System.out.println("  After swapping i=" + i + " and smallest=" + smallest + ": ");
//             for (int k : arr) System.out.print(k + " ");
//             System.out.println();
//         }

//         // Final sorted array
//         System.out.println("\nSorted array:");
//         for (int i : arr) System.out.print(i + " ");
//     }
// }
