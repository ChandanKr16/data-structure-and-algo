// Last updated: 8/5/2025, 8:29:08 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int j = 0;
        int len = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            while(set.contains(ch)){
                set.remove(s.charAt(j++));
                len--;
            }

            len++;
            maxLen = Math.max(maxLen, len);

            set.add(ch);

        }


        return maxLen;


    }
}