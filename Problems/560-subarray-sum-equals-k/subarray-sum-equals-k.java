class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
     //   int k = 3;
        int count = 0;
        int i = 0;
        while (i < n) {

            if (arr[i] == k) {
                count++;

            }
            int j = i + 1;
            int temp = arr[i];
            while (j < n) {
                temp = temp + arr[j];
                if (temp == k) {
                    count++;
                }
                j++;
            }
            i++;
        }

        return count;

    }
}