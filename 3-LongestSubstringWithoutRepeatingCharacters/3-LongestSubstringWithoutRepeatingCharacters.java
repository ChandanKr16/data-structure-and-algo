// Last updated: 8/22/2025, 9:01:34 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int len = 0;
        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;

        while(end < s.length()){

            char ch = s.charAt(end);

            // if(!map.containsKey(ch)){
            //     map.put(ch, 1);
            //     len++;
            //     maxLen = Math.max(len, maxLen);
                
            // }
         //   else{   

                while(map.containsKey(ch)){
                    char leftCh = s.charAt(start++);
                    map.put(leftCh, map.get(leftCh)-1);

                    if(map.get(leftCh) == 0) 
                        map.remove(leftCh);
                    len--;
                }

                map.put(ch, 1);
                len++;
          //  }

            // map.put(ch, 1);
            //     len++;
                maxLen = Math.max(len, maxLen);

            end++;


        }


       return maxLen;
    }
}