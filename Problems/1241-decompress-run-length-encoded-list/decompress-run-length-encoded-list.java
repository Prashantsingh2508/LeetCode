class Solution {
    public int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {

            int a = nums[i];
            int b = nums[i + 1];
            for (int j = 0; j < a; j++) {
                list.add(b);
            }
            i = i + 2;

        }
        int[] array = listToIntArray(list);
        return array;

    }

    public static int[] listToIntArray(List<Integer> list) {
        // Convert ArrayList<Integer> to int[]
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }
}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                