class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {

     String str[] = sentence.split("\\s+");
        int answer = 1;
        int flag=1;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() >= searchWord.length()) {
                if (search(str[i], searchWord)) {
                    flag=0;
                    answer = answer + i;
                }
                if (answer > 0 && flag==0) {
                    
                    break;
                }
            }
        }

        return answer > 0 && flag==0 ? answer : -1;


    }

    public boolean search(String s,String word){
        int i = 0;
        int len = word.length() - 1;
        String str = "";
        while (i <= len) {

            if (s.charAt(i) == word.charAt(i)) {
                str = str + s.charAt(i);
                i++;

            } else {

                break;
            }

        }
//        if (i != word.length() - 1) {
//            i = 0;
//        }

        return (str == null ? word == null : str.equals(word));


    }





}