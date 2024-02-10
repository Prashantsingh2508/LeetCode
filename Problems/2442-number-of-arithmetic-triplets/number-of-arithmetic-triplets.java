class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            map.put(nums[i],0);

        }


        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i]+diff) && map.containsKey((nums[i]+diff)+diff)){

                    count++;

            }

        }

        return count;


    }
}