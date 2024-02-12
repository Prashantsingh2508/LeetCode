class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        
        while (i < j) {
            if (even(nums[i]) && even(nums[j])) {
                i++;
            } else if (!even(nums[i]) && !even(nums[j])) {
                j--;
            } else if (even(nums[i]) && !even(nums[j])) {
                i++;
                j--;
            } else { // nums[i] is odd and nums[j] is even
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                j--;
            }
        }
        
        return nums;
    }

    public boolean even(int a) {
        return a % 2 == 0;
    }
}
