class Solution {
    public int lengthOfLongestSubstring(String s) {
        
            int max = 0; // 1. Fixed: Initialize to 0 instead of MIN_VALUE
    int i = 0; 
    Deque<Character> deque = new LinkedList<>(); 
    
    while(i < s.length()){ 
        char c = s.charAt(i); 
        if(!deque.contains(c)){ 
            deque.add(c); 
            max = Math.max(max, deque.size()); 
        } else { 
            while(true){ 
                char chr = deque.peek(); 
                if(chr == c){ 
                    deque.poll(); // 2. Fixed: Remove the matching element too
                    break; 
                } 
                deque.poll(); 
            }
            deque.add(c); // 3. Fixed: Add the new character into the queue
        } 
        i++; 
    } 
    return max; 

    }
}