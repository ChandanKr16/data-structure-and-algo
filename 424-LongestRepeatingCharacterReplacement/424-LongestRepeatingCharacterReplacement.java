// Last updated: 8/6/2025, 11:12:10 PM
class Solution {
    public int characterReplacement(String s, int k) {
        
        Map<Character, Integer> map = new HashMap<>();
        int len = 0, maxLen = 0, maxRepeat = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
            maxRepeat = Math.max(maxRepeat, map.get(ch));

            len++;
      
           
            while(i - start- maxRepeat+1> k){
                char startCh = s.charAt(start);
                
                map.put(startCh, map.get(startCh)-1);
                len--;
                start++;
                
            }
                   maxLen = Math.max(len, maxLen);
        }


        return maxLen;


    }
}