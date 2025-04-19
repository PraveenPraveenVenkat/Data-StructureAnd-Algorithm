/**
 * @param {Number[]} arr1
 * @param {Number[]} arr2
 * @returns {Number}
 */
class Solution {
    medianOf2(a, b) {
        // Merge both arrays
        let c = a.concat(b);

        // Sort using a numeric comparator
        c.sort((x, y) => x - y);

        let n = c.length;
        if (n % 2 === 0) {
            // If even, return average of the two middle numbers
            return (c[n / 2 - 1] + c[n / 2]) / 2;
        } else {
            // If odd, return the middle number
            return c[Math.floor(n / 2)];
        }
    }
}
