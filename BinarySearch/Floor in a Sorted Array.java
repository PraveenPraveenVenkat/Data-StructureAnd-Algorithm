class Solution{
static int findFloor(int[] arr, int k) {
    // Initialize result as -1, meaning no floor found
    int result = -1;

    // Base case: Check if k is less than the smallest element
    if (k < arr[0]) {
        return -1;
    }

    // Iterate through the array to find the floor of k
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > k) {
            result = i - 1; // Floor found as the previous element
            break;
        } else if (arr[i] == k) {
            result = i; // Exact match found
            break;
        }
    }

    // If no break occurs, the floor is the last element
    if (result == -1 && k >= arr[arr.length - 1]) {
        result = arr.length - 1;
    }

    return result;
}
}