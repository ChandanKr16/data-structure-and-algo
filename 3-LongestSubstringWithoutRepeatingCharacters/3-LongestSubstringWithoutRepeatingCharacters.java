// Last updated: 8/20/2025, 6:46:34 AM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLen = 0;
        int len = 0;
        int start = 0;
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            
            char ch = s.charAt(i);
            

            if(!set.contains(ch)){
                set.add(ch);
                len++;
                longestLen = Math.max(longestLen, len);
            }
            else{
                while(set.contains(ch)){
                    set.remove(s.charAt(start++));
                    len--;
                }
                set.add(ch);
                len++;
            }



        }


        return longestLen;
    }
}