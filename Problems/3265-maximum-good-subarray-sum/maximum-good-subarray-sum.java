class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer,Long> map=new HashMap<>();
        long curSum=0;
        long maxSum=Long.MIN_VALUE;
        for(int a:nums){

            if(map.containsKey(a-k)){

                    long minValue=map.get(a-k);
                    maxSum=Math.max(maxSum,curSum+a-minValue );

            }
                 if(map.containsKey(a+k)){

                    long minValue=map.get(a+k);
                    maxSum=Math.max(maxSum,curSum+a-minValue );

            }

            map.put(a,Math.min(map.getOrDefault(a, Long.MAX_VALUE),curSum));
            curSum+=a;


        }
        return maxSum == Long.MIN_VALUE ? 0 : maxSum;


    }
}