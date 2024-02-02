class Solution {
    public List<Integer> getRow(int numRow) {
        
        List<List<Integer>> triangle=new ArrayList<>();

        List<Integer> first_row=new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

 for(int i=1;i<=numRow;i++){
            
                List<Integer> prev_row=triangle.get(i-1);
                List<Integer>row=new ArrayList<>();
                
                row.add(1);
                for(int j=1;j<i;j++){
                
                    row.add(prev_row.get(j-1)+prev_row.get(j));
                    
                
                }
                row.add(1);
                triangle.add(row);
        
        
        
        }
           List<Integer> ans=triangle.get(numRow);
           return ans;
        
    }
}