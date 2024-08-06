Arrays.sort(arr);  // Sort the array
int start = 0;  // Initialize the start pointer
int end = arr.length - 1;  // Initialize the end pointer

while (start < end) {
    int sum = arr[start] + arr[end];
    if (sum == x) {
        return true;  // Return true if the sum matches the target
    } else if (sum < x) {
        start++;  // Move the start pointer to the right if the sum is less than target
    } else {
        end--;  // Move the end pointer to the left if the sum is greater than target
    }
}