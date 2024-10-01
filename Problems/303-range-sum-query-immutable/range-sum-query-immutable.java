class NumArray {
   static int dp[];
    public NumArray(int[] nums) {
        
        dp = new int[nums.length + 1];
        dp[0] = 0;
        for (int i = 1; i <= nums.length; i++) {

            dp[i] = dp[i - 1] + nums[i - 1];

        }


    }
    
    public int sumRange(int i, int j) {
        
        return dp[j + 1] - dp[i];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */