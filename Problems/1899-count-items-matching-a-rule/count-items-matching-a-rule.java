
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> item : items) {
            String type = item.get(0);
            String color = item.get(1);
            String name = item.get(2);

            if (ruleKey.equals("type") && type.equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("color") && color.equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("name") && name.equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
