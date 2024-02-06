class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index = 0;

        // Iterate over the first half of nums array
        for (int i = 0; i < n; i++) {
          
            ans[index++] = nums[i];
         
            ans[index++] = nums[i + n];
        }

        return ans;
    }
}
