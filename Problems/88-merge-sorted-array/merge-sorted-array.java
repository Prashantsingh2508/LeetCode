class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int k=0;k<n;k++){

                nums1[m+k] = nums2[k];


        }
        Arrays.sort(nums1);
        return;
    }
}