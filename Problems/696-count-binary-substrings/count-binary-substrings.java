class Solution {
    public int countBinarySubstrings(String s) {
       int zero = s.charAt(0)=='0'? 1:0;
        int one = s.charAt(0)=='1'? 1:0;
        int res =0;
        for(int i =1 ; i< s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                if(s.charAt(i)=='0') zero++;
                else one++;

            }else{
                res+= Math.min(zero , one);
                if(s.charAt(i)=='0')   zero=1;
               else one =1;
            }
     }
     return res+Math.min(zero , one);


        //         int count = 0;
        // int prevLength = 0;
        // int curLength = 1;

        // for (int i = 1; i < s.length(); i++) {
        //     if (s.charAt(i) == s.charAt(i - 1)) {
        //         curLength++; 
        //     } else {
        //         count += Math.min(prevLength, curLength); 
        //         prevLength = curLength; 
        //         curLength = 1; 
        //     }
        // }

        // count += Math.min(prevLength, curLength); 

        // return count;

    }
}