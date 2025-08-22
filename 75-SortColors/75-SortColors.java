// Last updated: 8/22/2025, 8:07:36 PM
class Solution {
    public String minWindow(String s, String t) {

        int left = 0;
        int right = 0;
        int count = 0;
        int startI = s.length();
        int endI = Integer.MAX_VALUE;
        int minLen = Integer.MAX_VALUE;

        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> map = new HashMap<>();

        for(char ch : t.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        } 

        while(right < s.length()){

            char ch = s.charAt(right);

           map.put(ch, map.getOrDefault(ch, 0)+1);

            if(freq.containsKey(ch)){
                 
                if(map.get(ch).intValue() == freq.get(ch).intValue()){
                    count++;
                }
            }

           
            while(count == freq.size()){

                    if(right - left + 1 < minLen){ 
                        startI = left;
                        minLen = Math.min(right - left +1, minLen);                        
                    }

                    char leftCh = s.charAt(left++);
                    

                    
                        map.put(leftCh, map.get(leftCh)-1);
                     
                    
                    if(map.get(leftCh) < freq.getOrDefault(leftCh, 0) ) {
                        
                        count--;
                    }
            

               
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(startI, startI+minLen); 
    }
}