class Solution {

  
    public int maxRepeating(String sequence, String word) {


        // String str="";    
        // countSub(sequence,word,str);
        // return count;

// Brute Force
   int count = 0;
        StringBuilder str = new StringBuilder(word);

        while (sequence.contains(str.toString())) {
            count++;
            str.append(word); 
        }

        return count;


    }


// private static void countSub(String str,String match,String subStr){

// if(subStr.equals(match))
// {

//     count++;
//     return;

// }

// if(str.isEmpty()){

//             return;

// }

    

// countSub();
// countSub(str.substring(1),match,subStr);
}
