class Solution {
    public int[] twoSum(int[] numbers, int target) {

   Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {

            int sum = target-numbers[i] ;
            if (map.containsKey(sum)) {

                return new int[]{map.get(sum) + 1, i + 1};

            }
            map.put(numbers[i], i);

        }

        return new int[]{};



        // int left = 0;
        // int right = numbers.length - 1;

        // while (left < right) {
        //     int currentSum = numbers[left] + numbers[right];

        //     if (currentSum == target) {
             
        //         return new int[]{left + 1, right + 1};
        //     } else if (currentSum < target) {
              
        //         left++;
        //     } else {
                
        //         right--;
        //     }
        // }

        // return null;
    }
}