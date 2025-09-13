



class Solution {
    public int maxSubArray(int[] a) {
  int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
             sum = Math.max(a[i], a[i] + sum);
            maxNumber = Math.max(maxNumber, sum);

           
          
            }
  return maxNumber ;
        }
      
// int maxNumber = Integer.MIN_VALUE;

//         for (int i = 0; i < a.length; i++) {

//             int max = a[i];
            
            
//            maxNumber = Math.max(maxNumber, a[i]);
//             for (int j = i + 1; j < a.length ; j++) {

//                 max = max + a[j];
//                 maxNumber = Math.max(maxNumber, max);

//             }

//         }
//         return maxNumber;


    //  int size = a.length;
    //     int[] dp = new int[size]; // Create an array to store intermediate results
    //     dp[0] = a[0];
    //     int ans = dp[0];
    //     for (int i = 1; i < size; i++) {

    //         dp[i] = Math.max(a[i], a[i] + dp[i - 1]);

    //         ans = Math.max(ans, dp[i]);

    //     }

    //     return ans;
    // }

    //   public int maxSubArray(int[] nums) {
    //     int sum = 0 , maxi = Integer.MIN_VALUE;;
    //     int i = 0 , j = 0;
    //     while(j<nums.length){
           
    //         if(sum < 0){
    //             sum = 0;
    //         }
    //          sum += nums[j];
    //         maxi = Math.max(maxi , sum);
    //         j++;
    //     }
    //     return maxi;
    // }
    }



    


    
    
    

    
    

    
        
    

    
        
        
        
    


    
    

    
        
        
    

    
        
        
    

    
        
    

    
        
    

    
        
    

    
        
    

    
        
        
    