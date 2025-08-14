// Last updated: 8/14/2025, 10:21:53 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int count = 0;
        int i = 0;
        int j = 0;

        while(i < s.length() && j < t.length()){

            char charI = s.charAt(i);
            char charT = t.charAt(j);

            if(charI == charT){
                i++;
                j++;
                count++;
            }
            else{
                j++;
            }

        }
        

        return count == s.length();

    }
}