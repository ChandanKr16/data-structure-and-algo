// Last updated: 8/31/2025, 6:35:22 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        int n = s.length();
        int repeatCount = 0;

        while(end < n){
            char ch = s.charAt(end);

            map.put(ch, map.getOrDefault(ch, 0)+1);

            repeatCount = Math.max(repeatCount, map.get(ch));

            if(end - start - repeatCount + 1 <= k){
                len = Math.max(len, end - start+1);
            }

            while(end - start - repeatCount + 1 > k){
                char startCh = s.charAt(start++);
                map.put(startCh, map.get(startCh)-1);
            }


            end++;
        }
        




        return len;
    }
}