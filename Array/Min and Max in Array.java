// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
        // Code Here
        
        // int min =integer.MIN_VALUE;
        // int max =integer.MAX_VALUE;
        
        // for (int i=0;arr.length;i++){
        //     if(x[i]>max)
        //     max =arr[i];
        //      if (arr[i]<min)
        //     min =arr[i];
           long max = arr[0] , min = arr[0] ;
        for(int val : arr){
           max = Math.max(max,val);
           min = Math.min(min,val);
        }
        return new Pair<>(min,max); 
        // return new Pair(min,max);
        // return arr[long];
        // int maxmin [2]= {max,min}
        // return maxmin;
    }
}







