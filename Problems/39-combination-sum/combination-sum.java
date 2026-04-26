class Solution {

      

    public List<List<Integer>> combinationSum(int[] arr, int target) {
        
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, target, arr,new ArrayList<>(), result);
            
    return result;

    }
   static void backtrack(int index, int target, int[] nums, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == nums.length || target < 0) return;


        current.add(nums[index]);
        backtrack(index, target - nums[index], nums, current, result);
        current.remove(current.size() - 1);

      
        backtrack(index + 1, target, nums, current, result);
    }
}