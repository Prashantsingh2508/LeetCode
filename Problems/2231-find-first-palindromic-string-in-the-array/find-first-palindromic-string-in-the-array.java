class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (isPalindrome(word)) {
                sb.append(word);
                break;
            }
        }
        return sb.toString();
    }

    private boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
