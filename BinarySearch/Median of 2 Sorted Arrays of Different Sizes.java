
class Solution {
    public double medianOf2(int a[], int b[]) {
        // Merge both arrays
        int[] c = new int[a.length + b.length];
        int index = 0;
        
        for (int i = 0; i < a.length; i++) {
            c[index++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[index++] = b[i];
        }

        // Sort the merged array
        Arrays.sort(c);

        int n = c.length;
        if (n % 2 == 0) {
            return (c[n / 2 - 1] + c[n / 2]) / 2.0;
        } else {
            return c[n / 2];
        }
    }
}
