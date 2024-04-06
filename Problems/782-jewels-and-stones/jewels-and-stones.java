class Solution {
    public int numJewelsInStones(String jewel, String stone) {
        
            int count = 0;
              HashSet<Character> hashSet = new HashSet<>();

        for (int i = 0; i < jewel.length(); i++) {

            hashSet.add(jewel.charAt(i));
        }

        for (int i = 0; i < stone.length(); i++) {

            if (hashSet.contains(stone.charAt(i))) {

                count++;
            }
        }

        return count;

    }
}