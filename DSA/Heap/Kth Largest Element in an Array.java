class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for (int i : nums) {
            minHeap.add(i);
            if (minHeap.size() > k) {
                minHeap.poll();
            }

        }
        return minHeap.peek();
    }
}
//? Alternate Approach
// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         // Max-heap → reverse natural order
//         PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

//         // Push all elements
//         for (int n : nums) {
//             maxHeap.add(n);
//         }

//         // Remove (k-1) largest elements
//         for (int i = 1; i < k; i++) {
//             maxHeap.poll();
//         }

//         // Now top is kth largest
//         return maxHeap.peek();
//     }
// }
