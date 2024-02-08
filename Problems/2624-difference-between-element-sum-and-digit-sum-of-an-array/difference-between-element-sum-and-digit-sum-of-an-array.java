class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int sum2=0;
        for (int j : nums) {

                sum2=sum2+sumOfDigit(j);
                
          
        }

        return Math.abs(sum-sum2);

    }

    public static int sumOfDigit(int number) {
    if (number == 10) {
            return 1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                