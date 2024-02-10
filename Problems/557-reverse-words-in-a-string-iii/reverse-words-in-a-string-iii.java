// class Solution {
//     public String reverseWords(String s) {
//         StringBuilder sb = new StringBuilder();
//         StringBuilder word = new StringBuilder();

//        for(char c:s.toCharArray()){


//            if(c!=' '){

//                word.append(c);

//            }
//            else{

//                sb.append(word.reverse()).append(' ');
//                 word.setLength(0);
//            }

//        }
//        sb.append(word.reverse());
//         return sb.toString();
//     }
// }

class Solution {
    public String reverseWords(String s) {
       int ls=-1;
       char str[]=s.toCharArray();
       for(int i=0;i<=s.length();i++){

            if(i==s.length() || str[i]==' '){

                    int startIndex=ls+1;
                    int endIndex=i-1;
                    while(startIndex<endIndex){

                        char temp=str[startIndex];
                        str[startIndex]=str[endIndex];
                        str[endIndex]=temp;
                        startIndex++;
                        endIndex--;

                    }

                    ls=i;

            }

       }

    return new String(str);
    }
}

