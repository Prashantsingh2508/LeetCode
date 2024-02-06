class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int a1 = 0;
        for (String a : operations) {
            if (a.equals("--X") || a.equals("X--")) {
                a1--;
            } else if (a.equals("++X") || a.equals("X++")) {
                a1++;
            }
        }
        return a1;
    }
}
