class Solution {
    public int missingNumber(int[] nums) {

        // int sum=0;
        // int ts=0;
        // for(int i=0;i<nums.length;i++){
        //     sum+=nums[i];
        //     ts+=i+1;
        // }
        // return ts-sum;


        int  length=nums.length;

        int missing=0;
        Arrays.sort(nums);
        for(int i=0;i<=length;i++){
            
            if(i==length){
                missing=i;
                break;
            }
            if(i!=nums[i]){
                missing=i;
                break;
            }
        }

        return missing;
    }
}