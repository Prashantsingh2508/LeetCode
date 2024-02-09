class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int ans=0,n=nums.size();
        int mid=(n+1)/2;
        int i=0;
        while(mid<n){
            if(nums.get(i)<nums.get(mid)){
                ans+=2;
                i++;
                mid++;
            }
            else{
                mid++;
            }
        }
        return nums.size()-ans;
    }
    
}