

class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int extraCandies) {

        int maximum = Arrays.stream(arr).max().orElseThrow();

        List<Boolean> list = new ArrayList<>();
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            max = arr[i] + extraCandies;
            if (max >= maximum) {
                list.add(true);

            } else {

                list.add(false);

            }

        }

        return list;

    }

}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                