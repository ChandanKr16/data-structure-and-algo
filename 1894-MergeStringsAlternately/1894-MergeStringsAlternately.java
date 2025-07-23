// Last updated: 7/23/2025, 10:53:28 PM
class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuffer buffer = new StringBuffer();
        int minLen = word1.length() > word2.length() ? word2.length() : word1.length();

        int i = 0;
        int j = 0;

        for(int k = 0; k < minLen; k++){
            buffer.append(word1.charAt(i++));
            buffer.append(word2.charAt(j++));
        }    

        for(int k = i; k  < word1.length(); k++){
            buffer.append(word1.charAt(k));
        } 

        for(int k = j; k  < word2.length(); k++){
            buffer.append(word2.charAt(k));
        } 

        return buffer.toString();

    }
}