class Solution {
    public int minimumSum(int[] arr) {
         int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                if (arr[left] > arr[i]) {
                   // int sum1 = arr[left] + arr[i];
                    while (right > left) {
                        if (arr[right] < arr[left]) {
                            min = Math.min(min, arr[left] + arr[i] + arr[right]);
                        }
                        right--;
                    }

                }
                right = arr.length - 1;
                left++;
            }
        }
        
        

        return (min>100000)?-1:min;


    }
}