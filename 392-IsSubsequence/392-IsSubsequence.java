// Last updated: 8/13/2025, 10:47:52 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int count = 0;
        int j = 0;
        int i = 0;

        while(i < t.length() && j < s.length()){
            

            char tChar = t.charAt(i);
            char sChar = s.charAt(j);

            if(tChar == sChar){
                j++;
                count++;
            }
            i++;

        }

        return count == s.length();

    }
}