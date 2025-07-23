// Last updated: 7/23/2025, 10:54:01 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length())
            return false;

        int count = 0;
        int countArr[] = new int[26];

        for(char ch : magazine.toCharArray()){
            countArr[ch - 'a'] += 1; 
        }   

        for(char ch : ransomNote.toCharArray()){
            
            if(countArr[ch - 'a'] > 0){
                countArr[ch - 'a']--;
                count++;
            }
            else return false;

        }    

        return count == ransomNote.length();
    }
}