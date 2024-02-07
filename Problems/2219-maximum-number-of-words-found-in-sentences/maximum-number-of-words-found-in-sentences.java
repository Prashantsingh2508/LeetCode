class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (String str:sentences) {

            max = Math.max(max, str.split("\\s+").length);

        }

        return max;

    }
}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                