import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] arr, int k) {

       if (arr == null || arr.length == 0) return Collections.emptyList();

        StringBuilder num = new StringBuilder();
        for (int a : arr) num.append(a);

        BigInteger number = new BigInteger(num.toString());
        number = number.add(BigInteger.valueOf(k));

        List<Integer> result = new ArrayList<>();
        for (char c : number.toString().toCharArray()) {
            result.add(c - '0');
        }

        return result;

    }
}