class Solution {
    public int findComplement(int num) {

           int length = Integer.toBinaryString(num).length();
           return num^(1<<length)-1;
     
    }
}