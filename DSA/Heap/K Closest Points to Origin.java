class Triplet {
    int x, y;
    double root;

    Triplet(int x, int y, double root) {
        this.root = root;
        this.x = x;
        this.y = y;

    }
}

class  TripletComparator implements Comparator <Triplet> {
    public int compare(Triplet a, Triplet b) {
        if (a.root > b.root) {
            return 1;
        } else if (a.root < b.root) {
            return -1;
        }
        return 0;
    }
  }

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Queue<Triplet> queue= new PriorityQueue <Triplet>(TripletComparetor()){
             Queue<Triplet> queue = new PriorityQueue<>(new TripletComparator());
            for(int i[]:points){
                double dist=Math.sqrt(((-i[0])*(-i[0])) +((-i[1])*(-i[1])));
                // queue.add(new Triplet(dist,i[0],i[1]));
                 queue.add(new Triplet(i[0], i[1], dist));
            }
            int res[] []= new int[k] [2];
           int index=0;
           while(k-->0){
            res[index][0]=queue.peek().x;
            res[index][1]=queue.peek().y;
             index++;
             queue.remove();
           }
              return res;   
    }
}

