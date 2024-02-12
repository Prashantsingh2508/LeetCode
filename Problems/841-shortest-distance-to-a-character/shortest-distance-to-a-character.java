class Solution {
    public int[] shortestToChar(String s, char c) {

            int a[]=new int[s.length()];

            for(int i=0;i<s.length();i++){

              if(s.charAt(i)==c){

                  a[i]=0;
                  continue;

              }


              String s1=s.substring(0,i);
              String s2=s.substring(i+1);

              int ind1=s1.lastIndexOf(c);
              int ind2=s2.indexOf(c);

              if(ind1==-1) ind1=Integer.MAX_VALUE;
              else ind1=s1.length()-ind1;

              if(ind2==-1) ind2=Integer.MAX_VALUE;
              else ind2=ind2+1;

              a[i]=Math.min(ind1,ind2);

            }

            return a;
    }
}