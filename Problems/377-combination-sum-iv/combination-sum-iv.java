class Solution {

   // static int count =0;
    public int combinationSum4(int[] a, int target) {

       int[] dp = new int[target + 1];
       Arrays.fill(dp, -1);

      return combination(a, target, 0, dp);

    }
 private static int combination(int[] a, int target, int sum, int[] dp) {
        if (sum == target) return 1;
        if (sum > target) return 0;
        if (dp[sum] != -1) return dp[sum];

        int total = 0;
        for (int num : a) {
            total += combination(a, target, sum + num, dp);
        }

        dp[sum] = total;
        return total;
    }
    //  private static void combination(int[] a, int target, int sum) {

    //     if (sum >= target) {

    //         if (sum == target) {

    //             count++;

    //         }

    //         return;

    //     }
    //       if (nums.length==1) {
    //         return 0;
    //     }
            

    //     for (int i = 0; i < a.length; i++) {

    //         combination(a, target, sum + a[i]);

    //     }

    // }
}