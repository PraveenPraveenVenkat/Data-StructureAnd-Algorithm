
class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
         ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<arr1.length;i++)
        arr.add(arr1[i]);
        
        for(int i=0;i<arr2.length;i++)
        arr.add(arr2[i]);
        
        Collections.sort(arr);
        
       
        return arr.get(k-1);
        
    }
}
        
        
//          int i=0;
//         int j=0;
//         long count=0;
//         boolean x=false;
//         while(i<arr1.length && j<arr2.length)
//         {
//           if(count==k-1)
//           {
//               x=true;
//           }
//             if(arr1[i]<=arr2[j])
//             {
//                 if(x==true)
//                 {
//                     return arr1[i];
//                 }
//                 i++;
//                 count++;
                
//                 continue;
//             }
//             else if(arr2[j]<arr1[i])
//             {
//                 if(x==true)
//                 {
//                     return arr2[j];
//                 }
//                 count++;
//                 j++;
                
//                 continue;
//             }
//         }
//         if(i==arr1.length)
//         {
            
//             while(j<arr2.length)
//             {
//                 if(count==k-1)
//                 {
//                     return arr2[j];
//                 }
//                 j++;
//                 count++;
                
//             }
//         }
//         if(j==arr2.length)
//         {
            
//             while(i<arr1.length)
//             {
//                 if(count==k-1)
//                 {
//                     return arr1[i];
//                 }
//                 i++;
//                 count++;
                
//             }
//         }
//         return 0;
//     }
// }