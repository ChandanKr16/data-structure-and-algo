// Last updated: 7/23/2025, 10:53:58 PM
class Solution {
    public int characterReplacement(String s, int k) {

        int maxLen = 0;
        int start = 0;
        int repeatCount = 0;
        
        Map<Character, Integer> map = new HashMap<>();

        for(int end = 0; end < s.length(); end++){

            char ch = s.charAt(end);

            map.put(ch, map.getOrDefault(ch, 0)+1);

            repeatCount = Math.max(repeatCount, map.get(ch));
                
            while(end - start + 1 - repeatCount > k){

                char leftCh = s.charAt(start);

                map.put(leftCh, map.get(leftCh)-1);

                start++;

            }

            maxLen = Math.max(maxLen, end - start+1);

        }

    

        return maxLen;

    }
}