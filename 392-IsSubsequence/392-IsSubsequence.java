// Last updated: 8/13/2025, 10:40:47 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int count = 0;
        int j = 0;

        if(s.length() == 0) return true;

        for(int i = 0; i < t.length(); i++){

            if(count == s.length()) return true;

            char tChar = t.charAt(i);
            char sChar = s.charAt(j);

            if(tChar == sChar){
                j++;
                count++;
            }

        }

        return count == s.length();

    }
}