class Solution {
    public int findMaxK(int[] nums) {

        if(nums.length==2&& Math.abs(nums[0])!=Math.abs(nums[1])){
                return -1;
        }
    //
        int sum=-1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                    if(Math.abs(nums[i])==Math.abs(nums[j]) && nums[i]!=nums[j]){

                            if(sum<Math.abs(nums[i])){

                                sum=Math.abs(nums[i]);
                            }

                    }

            }


        }
        
    return sum;

    }
}