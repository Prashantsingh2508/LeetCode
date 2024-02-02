class Solution {
    public String longestPalindrome(String s) {
        if(s==null|| s.length()<1){
            return "";

        }
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){

                int firstLen=expFromMiddle(s, i, i);
                int secondLen=expFromMiddle(s, i, i+1);
                int totalLength=Math.max(firstLen,secondLen);
                if(totalLength>end-start){

                        start=i-((totalLength-1)/2);
                        end=i+(totalLength/2);

                }

        }

        return s.substring(start,end+1);
        

    }


    public int expFromMiddle(String str,int left,int right){

        if(str==null||left>right ){return  0;}
        while(left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){

                left--;
                right++;


        }
        return right-left - 1;
    }
}