class Solution {
    public long findTheArrayConcVal(int[] nums) {

            int i=0;
            int j=nums.length-1;
            long sum=0;
            while(i<j){

        String str=String.valueOf(nums[i])+String.valueOf(nums[j]);
        sum=sum+Integer.parseInt(str);

            i++;j--;

            }
    if(nums.length%2!=0){
        sum=sum+nums[i];
    }   
    return sum;

    }
}