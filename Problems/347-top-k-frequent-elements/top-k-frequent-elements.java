class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        Map<Integer,Integer> map=new HashMap<>();


        for(int num:nums)
        {map.merge(num,1,Integer::sum);}

        PriorityQueue<Integer> queue=new PriorityQueue((a,b)->map.get(a)-map.get(b));

        for(int i:map.keySet()){
            queue.offer(i);
            if(queue.size()>k)
            {queue.poll();}

        }

        int[]res=new int[k];
        for(int j=k-1;j>=0;j--)
        {
            res[j]=queue.poll();
        }




    return res;

        
    }
}