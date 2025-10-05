class Solution {
    public int longestMountain(int[] arr) {
        int maxCount = 0;
        int i = 1;

        while (i < arr.length - 1) {

            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {

                int left = i - 1;
                int right = i + 1;
                while (left > 0 && arr[left] > arr[left - 1]) {

                    left--;

                }
                while (right < arr.length - 1 && arr[right] > arr[right + 1]) {

                    right++;

                }
                int range = right - left + 1;
                maxCount = Math.max(maxCount, range);
                i = right; // give handle back to the i 

            } else {

                i++; // traverse until not get a mid value full filling of peak
            }

        }

        return maxCount;

    }
}