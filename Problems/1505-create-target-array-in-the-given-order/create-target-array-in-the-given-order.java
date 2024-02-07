class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }
        
        // Convert List to int[]
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = targetList.get(i);
        }
        
        return target;
    }
}
