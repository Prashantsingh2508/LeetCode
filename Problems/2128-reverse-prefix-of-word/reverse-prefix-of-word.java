class Solution {
    public String reversePrefix(String word, char ch) {
        
        char c[]=word.toCharArray();

        for(int i=0;i<word.length();i++){


                if(c[i]==ch){

                    int startIndex=0;
                    int endIndex=i;
                    while(startIndex<endIndex){


                        char temp=c[endIndex];
                        c[endIndex]=c[startIndex];
                        c[startIndex]=temp;
                        startIndex++;
                        endIndex--;
                    }    
                        break;
                }

            


        }      

        return new String(c);  

    

    }
}