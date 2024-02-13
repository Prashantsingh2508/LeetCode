class Solution {
    public int countBinarySubstrings(String s) {
       int c0=s.charAt(0)=='0'?1:0;
        int c1=s.charAt(0)=='1'?1:0;

        int res=0;

        for(int i=1;i<s.length();i++){

            if(s.charAt(i)==s.charAt(i-1)){

                    if(s.charAt(i)=='0'){

                        c0++;
                    }
                    else{

                        c1++;
                    }


            }

            else{
                res=res+Math.min(c0,c1);
                if(s.charAt(i)=='0'){

                    c0=1;
                }
                else{

                    c1=1;
                }



            }


        }

return res+Math.min(c0,c1);


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