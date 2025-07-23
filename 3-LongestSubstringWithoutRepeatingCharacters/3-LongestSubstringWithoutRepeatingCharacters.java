// Last updated: 7/23/2025, 10:54:54 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int maxLen = 0;
        int start = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for(int end = 0; end < s.length(); end++){
            char ch = s.charAt(end);

            while(freq.containsKey(ch)){
                char leftChar = s.charAt(start);
                freq.put(leftChar, freq.get(leftChar)-1);

                if(freq.get(leftChar) == 0){
                    freq.remove(leftChar);
                }
                start++;

            }
            
            if(end - start + 1 > maxLen){
                maxLen = end - start + 1;
            }

            freq.put(ch, freq.getOrDefault(ch, 0)+1);
            

        }

        return maxLen;

    }
}