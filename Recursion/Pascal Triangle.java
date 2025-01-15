
class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<ArrayList<Long>> triangle = new ArrayList<>();

        // Initialize the first row of Pascal's Triangle
        ArrayList<Long> firstRow = new ArrayList<>();
        firstRow.add(1L);
        triangle.add(firstRow);

        long mod = 1000000007;

        // Build Pascal's Triangle up to the nth row
        for (int i = 1; i < n; i++) {
            ArrayList<Long> prev = triangle.get(i - 1);
            ArrayList<Long> current = new ArrayList<>();
            current.add(1L); // First element of each row is 1
            for (int j = 1; j < prev.size(); j++) {
                current.add((prev.get(j - 1) + prev.get(j)) % mod); // Compute the current element
            }
            current.add(1L); // Last element of each row is 1
            triangle.add(current);
        }

        // Get the nth row
        ArrayList<Long> ls = triangle.get(n - 1);

        // Convert the result to ArrayList<Integer>
        ArrayList<Integer> result = new ArrayList<>();
        for (Long val : ls) {
            result.add(val.intValue()); // Convert Long to Integer
        }

        return result;
    }
}
