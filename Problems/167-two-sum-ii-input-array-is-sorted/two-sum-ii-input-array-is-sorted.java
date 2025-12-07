class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int currentSum = numbers[left] + numbers[right];

            if (currentSum == target) {
                // Found the solution.
                // The problem requires 1-based indexing, so we add 1 to both indices.
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                // The sum is too small. Move the left pointer forward to increase the sum.
                left++;
            } else {
                // The sum is too large. Move the right pointer backward to decrease the sum.
                right--;
            }
        }

        // According to the problem constraints, this part should never be reached 
        // because a solution is guaranteed to exist.
        return null;
    }
}