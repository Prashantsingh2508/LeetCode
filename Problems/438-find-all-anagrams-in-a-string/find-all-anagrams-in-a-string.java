class Solution {
    public List<Integer> findAnagrams(String str, String ans) {
        List<Integer> list=new ArrayList<>();
        
        int l = 0;
      
        int size=ans.length();
        int right = size;
        while(l+size<=str.length()){
             
               if(anagramEngine(ans,str,l,size+l)) 
               {

                    list.add(l);

               }
               
               l++;
            
        }
        return list;
        
    }
     public static boolean anagramEngine(String t,String str,int intialIndex,int finalIndex) {
               String s=str.substring(intialIndex, finalIndex);
         if(s.length()!=t.length()){

                return false;
            }
                int a[]=new int[26];
            for(int i=0;i<s.length();i++){

                a[s.charAt(i)-'a']++;
                 a[t.charAt(i)-'a']--;
            }

            for(int c:a){
                if(c!=0) return false;
            }

            return true;
            
      
    }

}