import java.util.*;

class closeComparator  implements Comparator  <Integer>{
   
   int x;
   public closeComparator (int x){
     this.x=x;
   }
public int compare (Integer a,Integer b) {
    int diff= Math.abs(b-x)-Math.abs(a-x);
    if(diff==0){
        return b-a;
    }
    return diff;
    
   }

    
}  
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> min=new PriorityQueue<>(new closeComparator(x));
 

        for(int num:arr){
       min.offer(num);
       if(min.size()>k){
        min.poll();
       }
        }
        List <Integer>  res= new ArrayList<Integer>(min);
         Collections.sort(res);
         return res;
    }
}