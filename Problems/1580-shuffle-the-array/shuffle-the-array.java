class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int index=0;
        int i=0;
        while(i<n){
            ans[index++]=nums[i];
            ans[index++]=nums[n+i];

            i++;
        }

        return ans;
    }
}
