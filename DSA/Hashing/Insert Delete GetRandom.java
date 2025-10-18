// class RandomizedSet {
//     private ArrayList<Integer> list;
//     private Map<Integer, Integer> map;

//     public RandomizedSet() {
//         list = new ArrayList<>();
//         map = new HashMap<>();
//     }

//     public boolean search(int val) {
//         return map.containsKey(val);
//     }

//     public boolean insert(int val) {
//         if (search(val)) return false;

//         list.add(val);
//         map.put(val, list.size() - 1);
//         return true;
//     }

//     public boolean remove(int val) {
//         if (!search(val)) return false;

//         int index = map.get(val);
//         list.set(index, list.get(list.size() - 1));
//         map.put(list.get(index), index);
//         list.remove(list.size() - 1);
//         map.remove(val);

//         return true;
//     }

//     public int getRandom() {
//         Random rand = new Random();
//         return list.get(rand.nextInt(list.size()));
//     }
// }


//! Hareesh Approach
class RandomizedSet {
   
    private HashMap<Integer,Integer> map;
    private ArrayList<Integer> arr;
    private Random random;

    public RandomizedSet() {
      
      map = new HashMap<>();
      arr = new ArrayList<>();
      random =new Random();
    }
    public boolean insert(int val) {
        boolean isExist = map.containsKey(val);
        if(!isExist){
            arr.add(val);
            // map(val,arr.size()-1);
            map.put(val, arr.size() - 1);
        }
        return !isExist;

    }
    public boolean remove(int val) {
        boolean isExist = map.containsKey(val);
          if(isExist){
            int index = map.get(val);
            int lastVal =arr.get(arr.size()-1);
            arr.set(index,lastVal);
            map.put(lastVal,index);

            arr.remove(arr.size()-1);
            map.remove(val);
          }
          return isExist;
    }
    public int getRandom() {
    int idx = random.nextInt(arr.size());
    return arr.get(idx);

    }
}

