class Solution {
    public boolean checkSubarraySum(int[] arr, int k) {
       
        
        boolean flag = false;
     

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefix = 0;

        for (int a = 0; a < arr.length; a++) {
            prefix = (prefix + arr[a]) % k;

            if (map.containsKey(prefix)) {

                if (a - map.get(prefix) > 1) {
                    flag = true;
                    break;
                }
            }
            else{
            map.put(prefix, map.getOrDefault(prefix, a));
            }

        }
    return flag;

    }
}