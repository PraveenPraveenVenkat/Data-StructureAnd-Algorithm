class wordFrequency implements  Comparator<Map.Entry<String,Integer>>{
public int compare(Map.Entry<String,Integer> a,Map.Entry<String,Integer> b){
   if(a.getValue().equals(b.getValue())){
    return b.getKey().compareTo(a.getKey());
   }
   return a.getValue()-b.getValue();
}

}

class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         Map<String ,Integer> freq= new HashMap<>();
         for(String word:words){
         freq.put(word,freq.getOrDefault(word,0)+1);
         }
         PriorityQueue<Map.Entry<String,Integer>> maxHeap=new PriorityQueue<>(new wordFrequency());
         for(Map.Entry<String,Integer> entry:freq.entrySet()){
            maxHeap.offer(entry);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
         }

    List<String> res = new ArrayList<>();
   while(!maxHeap.isEmpty()){
    res.add(0,maxHeap.poll().getKey());
   }
    return res;
    }
}