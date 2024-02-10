class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c != ' ') {
                word.append(c);
            } else {
                sb.append(word.reverse()).append(' ');
                word.setLength(0); // Clear the word StringBuilder
            }
        }

        sb.append(word.reverse()); // Append the last word
        return sb.toString();
    }
}
