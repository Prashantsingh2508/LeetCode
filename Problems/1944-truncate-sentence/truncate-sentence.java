class Solution {
    public String truncateSentence(String s, int k) {
        String str[] = s.split("\\s+");
        String a[] = new String[k];
        int i = 0;
        while (i < k) {
            a[i] = str[i];
            i++;

        }

        return Arrays.toString(a).replaceAll("[,\\[\\]]", "");
    }
}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                