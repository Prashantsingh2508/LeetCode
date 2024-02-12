class Solution {
    public int[] sortArrayByParityII(int[] nums) {

       int a[]=new int[nums.length];
       int evenIndex=0;
       int oddIndex=1;
        for(int i:nums){

            if(even(i)){

                a[evenIndex]=i;
                evenIndex=evenIndex+2;


            }

            else{

                a[oddIndex]=i;
                oddIndex=oddIndex+2;
            }


        }

        return a;

    }
     public boolean even(int a) {
        return a % 2 == 0;
    }
}