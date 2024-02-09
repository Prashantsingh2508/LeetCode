
class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
     
        int i = 0;
        Set<Integer> removed = new HashSet<>();
        for (int j = nums.size() / 2; j < nums.size(); j ++) {
            if (nums.get(j) > nums.get(i) && !removed.contains(i)) {
                removed.add(i);
                removed.add(j);
                i ++;
            }
        }
        return nums.size() - removed.size();
    }
}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                