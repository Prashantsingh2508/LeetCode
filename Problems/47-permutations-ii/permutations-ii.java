class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

         List<List<Integer>> list = new ArrayList<>();
        permutation(nums, 0, list, new ArrayList<>());
        
        List<List<Integer>> l=list.stream().distinct().collect(Collectors.toList());

        return l;
    }

    private static void permutation(int[] arr, int index, List<List<Integer>> list, List<Integer> list1) {

        if (list1.size() == arr.length) {

            //  System.out.print(list1);
            list.add(new ArrayList<>(list1));
          
            return;

        }

        for (int i = index; i < arr.length; i++) {

            swap(i, index, arr);
            list1.add(arr[index]);
            permutation(arr, index + 1, list, list1);
            list1.remove(list1.size()-1);
            swap(i, index, arr);

        }

    }

    public static void swap(int a, int b, int arr[]) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}