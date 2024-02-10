class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder word = new StringBuilder();

       for(char c:s.toCharArray()){


           if(c!=' '){

               word.append(c);

           }
           else{

               sb.append(word.reverse()).append(' ');
                word.setLength(0);
           }

       }
       sb.append(word.reverse());
        return sb.toString();
    }
}
