class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
          List<List<Integer>> list = new ArrayList<>();
        Set<Set<Integer>> set = new HashSet<>();

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(a -> {
            System.out.println(a);
        });
        for (int j = 0; j < arr.length-3; j++) {
            if (j > 0 && arr[j] == arr[j - 1]) {
                continue;
            }

            for (int i = j + 1; i < arr.length-2; i++) {

               if (i > j+1 && arr[i] == arr[i - 1]) {
                   continue;
               }
                int left = i + 1;
                int right = arr.length - 1;
                while (left < right) {

                    long sum =(long) arr[j] + arr[i] + arr[left] + arr[right];
                    if (sum == target) {
                        List<Integer> list1 = new ArrayList<>();
                        Set<Integer> set1 = new HashSet<>();
                        list1.add(arr[j]);
                        list1.add(arr[i]);
                        list1.add(arr[left]);
                        list1.add(arr[right]);
                     
                        list.add(list1);

//                        set1= list1.stream().collect(Collectors.toSet());
//                        set.add(set1);
                        while (left < right && arr[left] == arr[left + 1]) {
                            left++;
                        }
                        while (left < right && arr[right] == arr[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    } else if (sum < target) {

                        left++;

                    } else {

                        right--;

                    }

                }

            }
        }

        return list;

    }
}