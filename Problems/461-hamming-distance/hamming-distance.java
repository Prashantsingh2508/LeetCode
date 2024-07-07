class Solution {
    public int hammingDistance(int x, int y) {
         
         int r=x^y;
         int c=0;
         while(r>0){

            c=c+(r&1);
        r= r >> 1;


         }

         return c;
    }
}