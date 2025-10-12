class Solution {
    public int reversePairs(int[] nums) {
        
        int ans=mergeSort(nums,0,nums.length-1);


        return ans;

    }

    private static int mergeSort(int nums[], int i, int e) {

        if (i >= e) {
            return 0;
        }

        int count = 0;
        int mid = i + (e - i) / 2;
        count += mergeSort(nums, i, mid);
        count += mergeSort(nums, mid + 1, e);
        count += countPair(nums, i, mid, e);

        conquer(nums, i, mid, e);

        return count;

    }

    private static int countPair(int[] arr, int s, int mid, int e) {

        int j = mid + 1;
        int count = 0;
        for (int i = s; i <= mid; i++) {

        while (j <= e && (long) arr[i] > 2L * arr[j]) {

                j++;

            }
            count += (j - (mid + 1));
        }
        return count;
    }

    private static void conquer(int[] arr, int s, int mid, int e) {

        int temp[] = new int[e - s + 1];
        int i = s;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= e) {

            if (arr[i] <= arr[j]) {

                temp[k++] = arr[i++];

            }

            else {

                temp[k++] = arr[j++];

            }

        }

        while (i <= mid) {

            temp[k++] = arr[i++];

        }
        while (j <= e) {

            temp[k++] = arr[j++];

        }
         for (int l = 0; l < temp.length; l++) {

            arr[s + l] = temp[l];

        }
    }

}