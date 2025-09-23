class Solution {
    public long maximumTripletValue(int[] arr) {
        long min = Long.MIN_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                if (arr[left] < arr[i]) {
                    while (right > left) {
                        // if (arr[right] > arr[left]) {
                           long sum=arr[i] - arr[left];
                            long max=sum*arr[right];
                            
                            min = Math.max(min, max );
                       // }
                        right--;
                    }
                }
                right = arr.length - 1;
                left++;
            }
        }
        return min <=0 ? 0 : min;
    }
}