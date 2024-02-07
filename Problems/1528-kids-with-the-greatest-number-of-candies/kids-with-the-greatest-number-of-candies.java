class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {


            int max = Arrays.stream(candies).max().orElseThrow();


    return candy(candies,extraCandies,max);

    }

    public List<Boolean> candy(int arr[],int extraCandies,int maximum){

         List<Boolean> list=new ArrayList<>();
        int max=0;
    
            for(int i=0;i<arr.length;i++){

                max=arr[i]+extraCandies;
                if(max>=maximum){
                    list.add(true);
                   
                }
                else{

                    list.add(false);
                  
                }
                

            }


            return list;

    }
}