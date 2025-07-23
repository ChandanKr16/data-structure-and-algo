// Last updated: 7/23/2025, 10:54:00 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int start = 0;
        int end = 0;
        int count = 0;

        while(start < s.length() && end < t.length()){
            
            if(s.charAt(start) == t.charAt(end)){
                count++;
                start++;
            }
            end++;

        }

        return count == s.length();

    }
}