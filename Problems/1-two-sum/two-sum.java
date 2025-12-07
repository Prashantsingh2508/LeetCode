class Solution {
    public int[] twoSum(int[] nums, int target) {

        int ans[]=new int[2];
        if(nums[0]+nums[1]==target && nums.length==2){
            
            ans[0]=0;
            ans[1]=1;
            return ans;
            
             }
        int k=0;
        for(int i=0;i<nums.length-1;i++){

            for(int j=i+1;j<nums.length;j++){

                    if(nums[i]+nums[j]==target)
                {
                    
                    ans[0]=i;
                    ans[1]=j;

                }


            }
            


        }
        return ans;

    }
}