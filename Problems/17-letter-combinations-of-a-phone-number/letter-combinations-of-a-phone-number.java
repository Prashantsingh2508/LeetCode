class Solution {
    public List<String> letterCombinations(String digits) {
        
          String map[] = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> list = new ArrayList<>();
   
        int size = digits.length();
        mapPhone(map, digits, "", size, list);
        //  System.err.println(""+list);

        return list;

    }

    private static void mapPhone(String[] map, String digits, String ch, int ind, List<String> list) {

        if (ch.length() == ind) {
            
            
           list.add(ch);
          //  System.err.println("" + ch);
            return;

        }

        String str = map[digits.charAt(0) - '0'];

        for (int i = 0; i < str.length(); i++) {

            mapPhone(map, digits.substring(1), ch + str.charAt(i), ind, list);
        }

    }
}