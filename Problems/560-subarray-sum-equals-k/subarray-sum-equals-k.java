class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        // int i = 0;
        // while (i < n) {

        //     if (arr[i] == k) {
        //         count++;

        //     }
        //     int j = i + 1;
        //     int temp = arr[i];
        //     while (j < n) {
        //         temp = temp + arr[j];
        //         if (temp == k) {
        //             count++;
        //         }
        //         j++;
        //     }
        //     i++;
        // }
 //int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefix = 0;

        for (int a : arr) {
            prefix += a;

            if (map.containsKey(prefix - k)) {
                count += map.get(prefix - k);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);

        }


        return count;

    }
}