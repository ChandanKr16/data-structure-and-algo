// Last updated: 8/25/2025, 10:09:54 PM
class Solution {
    public int characterReplacement(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        int repeatCount = 0;
        int start = 0, end = 0;

        while(end < s.length()){

            char ch = s.charAt(end);

            map.put(ch, map.getOrDefault(ch, 0)+1);

            repeatCount = Math.max(repeatCount, map.get(ch));

            

            while( end - start - repeatCount +1 > k){              
                
                char startCh = s.charAt(start++);

                map.put(startCh, map.getOrDefault(startCh, 0)-1);
                

            }

             len = Math.max(len, end - start+1);

            end++;

        }
        

        return len;
    }
}