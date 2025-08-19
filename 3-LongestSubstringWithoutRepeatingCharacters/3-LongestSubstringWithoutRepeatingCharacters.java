// Last updated: 8/19/2025, 5:48:34 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longestLen = 0;
        int currentLen = 0;
        Set<Character> set = new HashSet<>();
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);
                currentLen++;
                longestLen = Math.max(currentLen, longestLen);
            }
            else{

                while(set.contains(ch)){
                    set.remove(s.charAt(start++));
                    currentLen--;
                }
                set.add(ch);
                currentLen++;
            }
        }
        


        return longestLen;
    }
}