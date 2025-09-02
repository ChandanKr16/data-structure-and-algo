// Last updated: 9/2/2025, 9:04:15 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int len = 0;
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        int duplicateCount = 0;

        while(end < s.length()){

            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0)+1);

            duplicateCount = Math.max(duplicateCount, map.get(ch));

            if(end - start - duplicateCount + 1 <= k){
                len = Math.max(len, end - start+1);
            }

            while(end - start - duplicateCount + 1 > k){
                char startCh = s.charAt(start++);

                map.put(startCh, map.get(startCh)-1);
                                
            }

            end++;


        }
        


        return len;
    }
}