class Solution {
    public void rotate(int[] a, int k) {
        // Handle edge cases
        if (a == null || a.length <= 1 || k == 0) {
            return;
        }

        // Normalize k to avoid redundant rotations
        k = k % a.length;
        if (k < 0) {
            k += a.length; // Handle negative k
        }

        // Create temporary array
        int[] b = new int[a.length];

        // Copy last k elements to start of b
        for (int i = 0; i < k; i++) {
            b[i] = a[a.length - k + i];
        }

        // Copy remaining elements
        for (int i = 0; i < a.length - k; i++) {
            b[k + i] = a[i];
        }

        // Copy back to original array
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }
}