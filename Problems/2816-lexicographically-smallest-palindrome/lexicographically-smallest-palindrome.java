



class Solution {
    public String makeSmallestPalindrome(String s) {
        int a = 0;
        int b = s.length() - 1;
        char c[] = s.toCharArray();
        while (a < b) {

            if (c[a] != c[b]) {

                if (c[a] < c[b]) {
                    char temp = c[a];
                    c[b] = temp;
                    c[a] = temp;
                    a++;
                    b--;
                } else {

                    char temp = c[b];
                    c[a] = temp;
                    c[b] = temp;
                    a++;
                    b--;
                }

            } else {
                a++;
                b--;
            }

        }

        return new String(c);
    }
}



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    

  

    
        
    

    

    
        
    
            
                
                