// Last updated: 9/5/2025, 1:23:03 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;

        while(end < s.length()){

            char ch = s.charAt(end);
            

                while(map.containsKey(ch)){
                    char leftCh = s.charAt(start++);
                    map.put(leftCh, map.get(leftCh)-1);

                    map.remove(leftCh);
                    // if(map.get(leftCh) == 0) 
                    //     map.remove(leftCh);
                    len--;
                }

                map.put(ch, 1);
                len++;
      
                maxLen = Math.max(len, maxLen);

            end++;


        }


       return maxLen;
    }
}